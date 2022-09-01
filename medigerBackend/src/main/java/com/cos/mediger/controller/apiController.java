//package com.cos.mediger.controller;
//
//import java.awt.Container;
//import java.net.URLDecoder;
//
//import com.cos.mediger.api.apiService;
//import com.cos.mediger.api.apiVO;
//
//import lombok.RequiredArgsConstructor;
//
//import javax.annotation.PostConstruct;
//import javax.xml.parsers.DocumentBuilderFactory;
//
//import org.mybatis.spring.annotation.MapperScan;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.domain.EntityScan;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RestController;
//import org.w3c.dom.Document;
//import org.w3c.dom.Element;
//import org.w3c.dom.NodeList;
//import org.w3c.dom.Node;
//
//@SpringBootApplication
//@ComponentScan(basePackages = "com.cos.mediger.api")
//@EntityScan("com.cos.mediger.api.apiVO")
//@MapperScan("com.cos.mediger.mapper.apiMapper")
//public class apiController{
//	@Autowired(required=false)
//	private static apiService apiService ;
//	private static String getTagValue(String tag, Element eElement){
//		NodeList nlList = eElement.getElementsByTagName(tag).item(0).getChildNodes();
//		Node nValue= (Node) nlList.item(0);
//		if(nValue == null) {
//			return null;
//		}
//		return nValue.getNodeValue();
//	}
//
//	public apiController(apiService apiService) {
//		this.apiService = apiService;
//	}
//	
//	public static void main(String[] args) {
//		SpringApplication.run(apiController.class, args);
//		try {
//			String url="http://apis.data.go.kr/1471000/DrbEasyDrugInfoService/getDrbEasyDrugList";
//			String serviceKey="x6ClymIsRrZgFMQ86kkOl915ewDsnmf91rB2U6n1hZZG%2FLmk7BsTv0LngjaECB2KZ5ikoyxQW2ddXHgXWGe32g%3D%3D";
//			String decodeServiceKey = URLDecoder.decode(serviceKey, "UTF-8");
//			int pageNo=0;
//			for(int i = 0; i< 442; i++ ) {
//				
//				
//
//				pageNo++;
//				Document documentInfo = DocumentBuilderFactory
//						.newInstance()
//						.newDocumentBuilder()
//						.parse(url+"?serviceKey="+decodeServiceKey+"&pageNo="+pageNo);
//				documentInfo.getDocumentElement().normalize();
//				
//				System.out.print(pageNo);
//				NodeList nList = documentInfo.getElementsByTagName("item");
//					System.out.println("파싱할리스트 수:"+nList.getLength());
//					
//				for(int temp=0; temp < nList.getLength(); temp++) {
//					Node nNode = nList.item(temp);
//					apiVO vo = new apiVO();// VO
//					if(nNode.getNodeType() == Node.ELEMENT_NODE) {
//						
//						Element eElement = (Element) nNode;
//						System.out.println("##################################");
//						
//						System.out.println(getTagValue("entpName",eElement));
//						if (getTagValue("entpName", eElement) != null) {
//							vo.setEntpName(getTagValue("entpName",eElement));
//						}
//						else {
//							vo.setEntpName("blank");
//						}
//						System.out.println(getTagValue("itemName",eElement));
//						if (getTagValue("itemName",eElement)!=null) {
//						vo.setItemName(getTagValue("itemName",eElement));
//						}
//						else {
//							vo.setItemName("blank");
//						}
//						System.out.println(getTagValue("itemSeq",eElement));
//						if (getTagValue("itemSeq",eElement)!=null) {
//							vo.setItemSeq(getTagValue("itemSeq",eElement));
//							}
//							else {
//								vo.setItemSeq("blank");
//							}
//						System.out.println(getTagValue("efcyQesitm",eElement));
//						if (getTagValue("efcyQesitm",eElement)!=null) {
//							vo.setEfcyQesitm(getTagValue("efcyQesitm",eElement));
//							}
//							else {
//								vo.setEfcyQesitm("blank");
//							}
//						System.out.println(getTagValue("useMethodQesitm",eElement));
//						if (getTagValue("itemName",eElement)!=null) {
//							vo.setUseMethodQesitm(getTagValue("useMethodQesitm",eElement));
//							}
//							else {
//								vo.setUseMethodQesitm("blank");
//							}
//						System.out.println(getTagValue("atpnWarnQesitm",eElement));
//						if (getTagValue("atpnWarnQesitm",eElement)!=null) {
//							vo.setAtpnWarnQesitm(getTagValue("atpnWarnQesitm",eElement));
//							}
//							else {
//								vo.setAtpnWarnQesitm("blank");
//							}
//						System.out.println(getTagValue("atpnQesitm",eElement));
//						if (getTagValue("atpnQesitm",eElement)!=null) {
//							vo.setAtpnQesitm(getTagValue("atpnQesitm",eElement));
//							}
//							else {
//								vo.setAtpnQesitm("blank");
//							}
//						System.out.println(getTagValue("intrcQesitm",eElement));
//						if (getTagValue("intrcQesitm",eElement)!=null) {
//							vo.setIntrcQesitm(getTagValue("intrcQesitm",eElement));
//							}
//							else {
//								vo.setIntrcQesitm("blank");
//							}
//						System.out.println(getTagValue("seQesitm",eElement));
//						if (getTagValue("seQesitm",eElement)!=null) {
//							vo.setSeQesitm(getTagValue("seQesitm",eElement));
//							}
//							else {
//								vo.setSeQesitm("blank");
//							}
//						System.out.println(getTagValue("depositMethodQesitm",eElement));
//						if (getTagValue("depositMethodQesitm",eElement)!=null) {
//							vo.setDepositMethodQesitm(getTagValue("depositMethodQesitm",eElement));
//							}
//							else {
//								vo.setDepositMethodQesitm("blank");
//							}
//						System.out.println(getTagValue("openDe",eElement));
//						if (getTagValue("openDe",eElement)!=null) {
//							vo.setOpenDe(getTagValue("openDe",eElement));
//							}
//							else {
//								vo.setOpenDe("blank");
//							}
//						System.out.println(getTagValue("updateDe",eElement));
//						if (getTagValue("updateDe",eElement)!=null) {
//							vo.setUpdateDe(getTagValue("updateDe",eElement));
//							}
//							else {
//								vo.setUpdateDe("blank");
//							}
//						System.out.println(getTagValue("itemImage",eElement));
//						if(getTagValue("itemImage",eElement)!=null) {
//							vo.setItemImage(getTagValue("itemImage",eElement));
//						}else {
//							vo.setItemImage("blank");
//						}
//					}
//					try {
//						apiService.createApiVo(vo);
//					} catch (Exception e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//						continue;
//					}
//					
//					}
//				}
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		
//	}
//}