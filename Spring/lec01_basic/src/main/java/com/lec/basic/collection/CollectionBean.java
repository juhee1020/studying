package com.lec.basic.collection;
import java.util.*;

/*
	Collection 	XML
-------------------------	
	List		<list>
	Set			<set>
	Map			<map>
	Properties	<props>
*/
public class CollectionBean {

	private List<String> addressList;
	private Set<String> addressSet;
	private Map<String, String> addMap;
	private Properties addProps;


	public List<String> getAddressList() {return addressList;}
	public void setAddressList(List<String> addressList) {this.addressList = addressList;}

	public Set<String> getAddressSet() {return addressSet;}
	public void setAddressSet(Set<String> addressSet) {this.addressSet = addressSet;}

	public Map<String, String> getAddMap() {return addMap;}
	public void setAddMap(Map<String, String> addMap) {this.addMap = addMap;}

	public Properties getAddProps() {return addProps;}
	public void setAddProps(Properties addProps) {this.addProps = addProps;}
	
	
}