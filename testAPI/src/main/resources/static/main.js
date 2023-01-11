async function getDate(area_select){
    const url='http://apis.data.go.kr/1543061/animalShelterSrvc/shelterInfo?serviceKey=1u9OcPZBNH0dLUlpKbDQ9ZTFjhByrP49Hmk5dWIYwJl8QRbOWm4kj7NsH9%2FxJzsCtUnLpdYzVW%2BpnTIu2JznFQ%3D%3D&numOfRows=186&pageNo=1&_type=json';
    // serviceKey : 인증키 / numOfRows : 총 센터가 186개라서 / pageNo : 한페이지에 186개 다 뽑겠다. / _type : json형식으로 받겠다.
    const response=await fetch(url);
    const data=await response.json();

    const locations=data.response.body.items.item.filter(spot => spot.orgNm.substr(0,2)==area_select);

    drawMap(locations);
}
getDate();


function selectArea(){
    var area_select=document.getElementById("area");
    area_select=area_select.options[area_select.selectedIndex].value;
    getDate(area_select);
}


// 카카오 - 여러개 마커에 이벤트 등록하기1
// https://apis.map.kakao.com/web/sample/multipleMarkerEvent/

function drawMap(locations){
    var mapContainer = document.getElementById('map'), // 지도를 표시할 div
        mapOption = {
            center: new kakao.maps.LatLng(37.541, 126.986), // 지도의 중심좌표
            level: 10 // 지도의 확대 레벨
        };

    var map = new kakao.maps.Map(mapContainer, mapOption); // 지도를 생성합니다

    // 마커를 표시할 위치와 title 객체 배열입니다
    var positions = [];
    for(var i=0; i<locations.length; i++){
        positions[i]={
            title:locations[i].careNm,
            latlng: new kakao.maps.LatLng(locations[i].lat, locations[i].lng)
        }
    }

    // 마커 이미지의 이미지 주소입니다 - 없어도 됨
    //var imageSrc = "https://t1.daumcdn.net/localimg/localimages/07/mapapidoc/markerStar.png";

    for (var i = 0; i < positions.length; i ++) {

        // 마커 이미지의 이미지 크기 입니다 - 없어도 됨
        //var imageSize = new kakao.maps.Size(24, 35);

        // 마커 이미지를 생성합니다 - 없어도 됨
        //var markerImage = new kakao.maps.MarkerImage(imageSrc, imageSize);

        // 마커를 생성합니다
        var marker = new kakao.maps.Marker({
            map: map, // 마커를 표시할 지도
            position: positions[i].latlng, // 마커를 표시할 위치
        });
        // 마커에 표시할 인포윈도우를 생성합니다
        var infowindow = new kakao.maps.InfoWindow({
            content: positions[i].title // 인포윈도우에 표시할 내용
        });

        // 마커에 mouseover 이벤트와 mouseout 이벤트를 등록합니다
        // 이벤트 리스너로는 클로저를 만들어 등록합니다
        // for문에서 클로저를 만들어 주지 않으면 마지막 마커에만 이벤트가 등록됩니다
        kakao.maps.event.addListener(marker, 'mouseover', makeOverListener(map, marker, infowindow));
        kakao.maps.event.addListener(marker, 'mouseout', makeOutListener(infowindow));
    }

    // 인포윈도우를 표시하는 클로저를 만드는 함수입니다
    function makeOverListener(map, marker, infowindow) {
        return function() {
            infowindow.open(map, marker);
        };
    }

    // 인포윈도우를 닫는 클로저를 만드는 함수입니다
    function makeOutListener(infowindow) {
        return function() {
            infowindow.close();
        };
    }
}