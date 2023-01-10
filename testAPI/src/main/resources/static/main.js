async function getDate(){
    const url='http://apis.data.go.kr/1543061/animalShelterSrvc/shelterInfo?serviceKey=1u9OcPZBNH0dLUlpKbDQ9ZTFjhByrP49Hmk5dWIYwJl8QRbOWm4kj7NsH9%2FxJzsCtUnLpdYzVW%2BpnTIu2JznFQ%3D%3D&numOfRows=186&pageNo=1&_type=json';
    // serviceKey : 인증키 / numOfRows : 총 센터가 186개라서 / pageNo : 한페이지에 186개 다 뽑겠다. / _type : json형식으로 받겠다.
    const response=await fetch(url);
    const data=await response.json();
    console.log("data", data);
    const locations=data.body.items.item.filter(spot => spot.orgNm.substr(0,2)=='서울');

    console.log("locations",locations);

    //drawMap(locations);
}
getDate();
/*
function drawMap(locations){
    var mapContainer = document.getElementById('map'),
        mapOption = {
            center: new kakao.maps.LatLng(locations.lat, locations.lng),
            level: 3
        };
    var map = new kakao.maps.Map(mapContainer, mapOption);
    var position =  new kakao.maps.LatLng(locations.lat, locations.lng);

    var marker = new kakao.maps.Marker({
      position: position,
      clickable: true
    });
    marker.setMap(map);
}
*/