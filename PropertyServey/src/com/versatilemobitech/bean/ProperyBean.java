package com.versatilemobitech.bean;

import java.io.Serializable;
import java.util.ArrayList;

public class ProperyBean implements Serializable{

	/**
	 * 
	 */
	
	private String userName="";
	private String userID="";
	private static final long serialVersionUID = 1L;
	//New Survey Application Form Bean
	
	private String signatureImgPath="";
	private String PhotoOfPropertyImgPath="";
	private String PhotoOfSitePlanImgPath="";
	 
 
	
	public String getSignatureImgPath() {
		return signatureImgPath;
	}


	public void setSignatureImgPath(String signatureImgPath) {
		this.signatureImgPath = signatureImgPath;
	}


	public String getPhotoOfPropertyImgPath() {
		return PhotoOfPropertyImgPath;
	}


	public void setPhotoOfPropertyImgPath(String photoOfPropertyImgPath) {
		PhotoOfPropertyImgPath = photoOfPropertyImgPath;
	}


	public String getPhotoOfSitePlanImgPath() {
		return PhotoOfSitePlanImgPath;
	}


	public void setPhotoOfSitePlanImgPath(String photoOfSitePlanImgPath) {
		PhotoOfSitePlanImgPath = photoOfSitePlanImgPath;
	}


	private String buildingId;
	
	

	/**
	 * Data Provided By
	 */
	private String  dataProvidedBy="";
	private String relationshipOfOwner="";
	private String mobileNo="";
	private String EmailID="";
	private String NameOfDataProvider="";
	private String OwnerUIDNumber="";
	private String BasicPhoneNo="";

	/**
	 * Taxpayer/Occupier/Owner's Detail
	 */
	ArrayList<NameBean> nameList=new ArrayList<NameBean>();

	/**
	 * Address for communication
	 */

	private String isSameAddress="0";
	private String AddressforCommunication="";
	private String PermanentAddress_Address="";
	private String MobileNo_Address="";
	private String EmailID_Address="";
	private String PermanentAddress="";
	private String BasicPhoneNo_Address="";

	/**
	 * Details Of Property/Building
	 */

	private String Plot_Flat_ShopNo="";
	private String Zone="";
	private String Colony_Name="";
	private String City="Jaipur";
	private String State="Rajasthan";
	private String Name_No_OfBuilding="";
	private String DetailsOfOwnership="";
	private String WhetherConstructionOnPlot="0";
	private String NameOfLane_Road="";
	private String Landmark="";
	private String Ward="";
	private String District="Jaipur";
	private String Name_No_OfBuilding_pre="";
	private String IncaseofMultistoreyBuilding="";
	private String Length="";
	private String Width="";
	private String TypOfConstruction="";

	private String No_Of_Floors="";
	// Area 
	private String TotalPlotArea="";
	private String PlinthArea="";
	private String VacantArea="";
	private String TotalConstructionArea="";

	// Yard
	private String TotalPlotYard="";
	private String PlinthYard="";
	private String VacantYard="";
	private String TotalConstructionYard="";

	/*
	 * Use Of Land/Building & Details Of Floor Areas
	 */

	ArrayList<BuildingDetails> bulidList=new ArrayList<BuildingDetails>();

	/**
	 * Use Of Property(Please tick if applicable)
	 */

	private String PrivateHospitalClinic="0";
	private String  Residentialcum_commercial="0";
	private String  BeautyParlour="0";
	private String  PrivateOffice="0";
	private String  MarriageGardenHall="0";
	private String  HotelRestaurant="0";
	private String SemiGovtInstitute="0";
	private String CentralGovPropertyOffice="0";
	private String School="0";
	private String ProfessionalCollege="0";
	private String CompletelyReligiousProperty="0";
	private String SituatedInRicoArea="0";
	private String ExempteUnderclause107Act2009="0";
	private String DharmashalaOfCommunitySociety="0";
	private String CinemahallMultiplex="0";
	private String GeneralDegreeCollege="0";
	private String CoachingInstitute="0";
	private String OutOfRicoIndustries="0";


	private String StateGovtPropertyOffice="";
	private String ReligiousPlace="";
	private String Residential="";
	private String  Others=""; //Other valu only when accept click okay


	//Yes are no
	private String SewerConnection="0";
	private String  LightConnection="0";
	private String  Boring="0";
	private String  Parking="0";
	private String  AdvertisementHoarding="0";
	private String  StreetLight="0";
	private String  PrivateToilet="0";
	private String 	 MobileTower="0";
	private String 	 OpenToilet="0";
	private String 	 WhetherpayUdTax="0";
	private String 	 WhetherpayLeaseTax="0";
	private String 	 SewerLine="0";
	private String  SepticTank="0";
	private String 	 PipedWaterConnection="0";
	private String 	 FireFightingSystem="0";

	private String  WhetherpayUdTax_ACNo="";
	private String  WhetherpayLeaseTax_ACNo="";
	private  String  PleaseWriteSizefBoardSqft="";
	private String  dharmashala="";


	/**
	 * Survey Details
	 */

	private  String NameOfSurveyor="";
	private  String  SurveyorAddress="";
	private  String  IdCodeOfSurveyor="";
	private  String  Date_Surveyor="";
	//private  String  NameOfAttestingAuthority="";
	//private  String  DesignationOfAttestingAuthority="";
	//private  String  Date_Attesting ="";

	static ProperyBean mProperyBean=null;
	
	
	
	
	
	public String getBuildingId() {
		return buildingId;
	}


	public void setBuildingId(String buildingId) {
		this.buildingId = buildingId;
	}


	public String getPrivateHospitalClinic() {
		return PrivateHospitalClinic;
	}


	public void setPrivateHospitalClinic(String privateHospitalClinic) {
		PrivateHospitalClinic = privateHospitalClinic;
	}


	public String getResidentialcum_commercial() {
		return Residentialcum_commercial;
	}


	public void setResidentialcum_commercial(String residentialcum_commercial) {
		Residentialcum_commercial = residentialcum_commercial;
	}


	public String getBeautyParlour() {
		return BeautyParlour;
	}


	public void setBeautyParlour(String beautyParlour) {
		BeautyParlour = beautyParlour;
	}


	public String getPrivateOffice() {
		return PrivateOffice;
	}


	public void setPrivateOffice(String privateOffice) {
		PrivateOffice = privateOffice;
	}


	public String getMarriageGardenHall() {
		return MarriageGardenHall;
	}


	public void setMarriageGardenHall(String marriageGardenHall) {
		MarriageGardenHall = marriageGardenHall;
	}


	public String getHotelRestaurant() {
		return HotelRestaurant;
	}


	public void setHotelRestaurant(String hotelRestaurant) {
		HotelRestaurant = hotelRestaurant;
	}


	public String getSemiGovtInstitute() {
		return SemiGovtInstitute;
	}


	public void setSemiGovtInstitute(String semiGovtInstitute) {
		SemiGovtInstitute = semiGovtInstitute;
	}


	public String getCentralGovPropertyOffice() {
		return CentralGovPropertyOffice;
	}


	public void setCentralGovPropertyOffice(String centralGovPropertyOffice) {
		CentralGovPropertyOffice = centralGovPropertyOffice;
	}


	public String getSchool() {
		return School;
	}


	public void setSchool(String school) {
		School = school;
	}


	public String getProfessionalCollege() {
		return ProfessionalCollege;
	}


	public void setProfessionalCollege(String professionalCollege) {
		ProfessionalCollege = professionalCollege;
	}


	public String getCompletelyReligiousProperty() {
		return CompletelyReligiousProperty;
	}


	public void setCompletelyReligiousProperty(String completelyReligiousProperty) {
		CompletelyReligiousProperty = completelyReligiousProperty;
	}


	public String getSituatedInRicoArea() {
		return SituatedInRicoArea;
	}


	public void setSituatedInRicoArea(String situatedInRicoArea) {
		SituatedInRicoArea = situatedInRicoArea;
	}


	public String getExempteUnderclause107Act2009() {
		return ExempteUnderclause107Act2009;
	}


	public void setExempteUnderclause107Act2009(String exempteUnderclause107Act2009) {
		ExempteUnderclause107Act2009 = exempteUnderclause107Act2009;
	}


	public String getDharmashalaOfCommunitySociety() {
		return DharmashalaOfCommunitySociety;
	}


	public void setDharmashalaOfCommunitySociety(
			String dharmashalaOfCommunitySociety) {
		DharmashalaOfCommunitySociety = dharmashalaOfCommunitySociety;
	}


	public String getCinemahallMultiplex() {
		return CinemahallMultiplex;
	}


	public void setCinemahallMultiplex(String cinemahallMultiplex) {
		CinemahallMultiplex = cinemahallMultiplex;
	}


	public String getGeneralDegreeCollege() {
		return GeneralDegreeCollege;
	}


	public void setGeneralDegreeCollege(String generalDegreeCollege) {
		GeneralDegreeCollege = generalDegreeCollege;
	}


	public String getCoachingInstitute() {
		return CoachingInstitute;
	}


	public void setCoachingInstitute(String coachingInstitute) {
		CoachingInstitute = coachingInstitute;
	}


	public String getOutOfRicoIndustries() {
		return OutOfRicoIndustries;
	}


	public void setOutOfRicoIndustries(String outOfRicoIndustries) {
		OutOfRicoIndustries = outOfRicoIndustries;
	}


	public String getSewerConnection() {
		return SewerConnection;
	}


	public void setSewerConnection(String sewerConnection) {
		SewerConnection = sewerConnection;
	}


	public String getLightConnection() {
		return LightConnection;
	}


	public void setLightConnection(String lightConnection) {
		LightConnection = lightConnection;
	}


	public String getBoring() {
		return Boring;
	}


	public void setBoring(String boring) {
		Boring = boring;
	}


	public String getParking() {
		return Parking;
	}


	public void setParking(String parking) {
		Parking = parking;
	}


	public String getAdvertisementHoarding() {
		return AdvertisementHoarding;
	}


	public void setAdvertisementHoarding(String advertisementHoarding) {
		AdvertisementHoarding = advertisementHoarding;
	}


	public String getStreetLight() {
		return StreetLight;
	}


	public void setStreetLight(String streetLight) {
		StreetLight = streetLight;
	}


	public String getPrivateToilet() {
		return PrivateToilet;
	}


	public void setPrivateToilet(String privateToilet) {
		PrivateToilet = privateToilet;
	}


	public String getMobileTower() {
		return MobileTower;
	}


	public void setMobileTower(String mobileTower) {
		MobileTower = mobileTower;
	}


	public String getOpenToilet() {
		return OpenToilet;
	}


	public void setOpenToilet(String openToilet) {
		OpenToilet = openToilet;
	}


	public String getWhetherpayUdTax() {
		return WhetherpayUdTax;
	}


	public void setWhetherpayUdTax(String whetherpayUdTax) {
		WhetherpayUdTax = whetherpayUdTax;
	}


	public String getWhetherpayLeaseTax() {
		return WhetherpayLeaseTax;
	}


	public void setWhetherpayLeaseTax(String whetherpayLeaseTax) {
		WhetherpayLeaseTax = whetherpayLeaseTax;
	}


	public String getSewerLine() {
		return SewerLine;
	}


	public void setSewerLine(String sewerLine) {
		SewerLine = sewerLine;
	}


	public String getSepticTank() {
		return SepticTank;
	}


	public void setSepticTank(String septicTank) {
		SepticTank = septicTank;
	}


	public String getPipedWaterConnection() {
		return PipedWaterConnection;
	}


	public void setPipedWaterConnection(String pipedWaterConnection) {
		PipedWaterConnection = pipedWaterConnection;
	}


	public String getFireFightingSystem() {
		return FireFightingSystem;
	}


	public void setFireFightingSystem(String fireFightingSystem) {
		FireFightingSystem = fireFightingSystem;
	}


	//Instance
	static public ProperyBean getInstance() {

		if(mProperyBean==null)
			mProperyBean=new ProperyBean();
		return mProperyBean;
	}

	static public void resetData(){
		if(mProperyBean!=null)
			mProperyBean=null;
	}

	public String getDataProvidedBy() {
		return dataProvidedBy;
	}
	public void setDataProvidedBy(String dataProvidedBy) {
		this.dataProvidedBy = dataProvidedBy;
	}
	public String getRelationshipOfOwner() {
		return relationshipOfOwner;
	}
	public void setRelationshipOfOwner(String relationshipOfOwner) {
		this.relationshipOfOwner = relationshipOfOwner;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmailID() {
		return EmailID;
	}
	public void setEmailID(String emailID) {
		EmailID = emailID;
	}
	public String getNameOfDataProvider() {
		return NameOfDataProvider;
	}
	public void setNameOfDataProvider(String nameOfDataProvider) {
		NameOfDataProvider = nameOfDataProvider;
	}
	public String getOwnerUIDNumber() {
		return OwnerUIDNumber;
	}
	public void setOwnerUIDNumber(String ownerUIDNumber) {
		OwnerUIDNumber = ownerUIDNumber;
	}
	public String getBasicPhoneNo() {
		return BasicPhoneNo;
	}
	public void setBasicPhoneNo(String basicPhoneNo) {
		BasicPhoneNo = basicPhoneNo;
	}
	public ArrayList<NameBean> getNameList() {
		return nameList;
	}
	public void setNameList(ArrayList<NameBean> nameList) {
		this.nameList = nameList;
	}
	public String getAddressforCommunication() {
		return AddressforCommunication;
	}
	public void setAddressforCommunication(String addressforCommunication) {
		AddressforCommunication = addressforCommunication;
	}
	public String getPermanentAddress_Address() {
		return PermanentAddress_Address;
	}
	public void setPermanentAddress_Address(String permanentAddress_Address) {
		PermanentAddress_Address = permanentAddress_Address;
	}
	public String getMobileNo_Address() {
		return MobileNo_Address;
	}
	public void setMobileNo_Address(String mobileNo_Address) {
		MobileNo_Address = mobileNo_Address;
	}
	public String getEmailID_Address() {
		return EmailID_Address;
	}
	public void setEmailID_Address(String emailID_Address) {
		EmailID_Address = emailID_Address;
	}
	public String getPermanentAddress() {
		return PermanentAddress;
	}
	public void setPermanentAddress(String permanentAddress) {
		PermanentAddress = permanentAddress;
	}
	public String getBasicPhoneNo_Address() {
		return BasicPhoneNo_Address;
	}
	public void setBasicPhoneNo_Address(String basicPhoneNo_Address) {
		BasicPhoneNo_Address = basicPhoneNo_Address;
	}
	public String getPlot_Flat_ShopNo() {
		return Plot_Flat_ShopNo;
	}
	public void setPlot_Flat_ShopNo(String plot_Flat_ShopNo) {
		Plot_Flat_ShopNo = plot_Flat_ShopNo;
	}
	public String getZone() {
		return Zone;
	}
	public void setZone(String zone) {
		Zone = zone;
	}
	public String getColony_Name() {
		return Colony_Name;
	}
	public void setColony_Name(String colony_Name) {
		Colony_Name = colony_Name;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getName_No_OfBuilding() {
		return Name_No_OfBuilding;
	}
	public void setName_No_OfBuilding(String name_No_OfBuilding) {
		Name_No_OfBuilding = name_No_OfBuilding;
	}
	public String getDetailsOfOwnership() {
		return DetailsOfOwnership;
	}
	public void setDetailsOfOwnership(String detailsOfOwnership) {
		DetailsOfOwnership = detailsOfOwnership;
	}
 	public String getWhetherConstructionOnPlot() {
		return WhetherConstructionOnPlot;
	} 
	public void setWhetherConstructionOnPlot(String whetherConstructionOnPlot) {
		WhetherConstructionOnPlot = whetherConstructionOnPlot;
	}
	public String getNameOfLane_Road() {
		return NameOfLane_Road;
	}
	public void setNameOfLane_Road(String nameOfLane_Road) {
		NameOfLane_Road = nameOfLane_Road;
	}
	public String getWard() {
		return Ward;
	}
	public void setWard(String ward) {
		Ward = ward;
	}
	public String getDistrict() {
		return District;
	}
	public void setDistrict(String district) {
		District = district;
	}
	public String getName_No_OfBuilding_pre() {
		return Name_No_OfBuilding_pre;
	}
	public void setName_No_OfBuilding_pre(String name_No_OfBuilding_pre) {
		Name_No_OfBuilding_pre = name_No_OfBuilding_pre;
	}
	public String getIncaseofMultistoreyBuilding() {
		return IncaseofMultistoreyBuilding;
	}
	public void setIncaseofMultistoreyBuilding(String incaseofMultistoreyBuilding) {
		IncaseofMultistoreyBuilding = incaseofMultistoreyBuilding;
	}
	public String getLength() {
		return Length;
	}
	public void setLength(String length) {
		Length = length;
	}
	public String getWidth() {
		return Width;
	}
	public void setWidth(String width) {
		Width = width;
	}
	public String getTypOfConstruction() {
		return TypOfConstruction;
	}
	public void setTypOfConstruction(String typOfConstruction) {
		TypOfConstruction = typOfConstruction;
	}
	public String getNo_Of_Floors() {
		return No_Of_Floors;
	}
	public void setNo_Of_Floors(String no_Of_Floors) {
		No_Of_Floors = no_Of_Floors;
	}
	public String getTotalPlotArea() {
		return TotalPlotArea;
	}
	public void setTotalPlotArea(String totalPlotArea) {
		TotalPlotArea = totalPlotArea;
	}
	public String getPlinthArea() {
		return PlinthArea;
	}
	public void setPlinthArea(String plinthArea) {
		PlinthArea = plinthArea;
	}
	public String getVacantArea() {
		return VacantArea;
	}
	public void setVacantArea(String vacantArea) {
		VacantArea = vacantArea;
	}
	public String getTotalConstructionArea() {
		return TotalConstructionArea;
	}
	public void setTotalConstructionArea(String totalConstructionArea) {
		TotalConstructionArea = totalConstructionArea;
	}
	public String getTotalPlotYard() {
		return TotalPlotYard;
	}
	public void setTotalPlotYard(String totalPlotYard) {
		TotalPlotYard = totalPlotYard;
	}
	public String getPlinthYard() {
		return PlinthYard;
	}
	public void setPlinthYard(String plinthYard) {
		PlinthYard = plinthYard;
	}
	public String getVacantYard() {
		return VacantYard;
	}
	public void setVacantYard(String vacantYard) {
		VacantYard = vacantYard;
	}
	public String getTotalConstructionYard() {
		return TotalConstructionYard;
	}
	public void setTotalConstructionYard(String totalConstructionYard) {
		TotalConstructionYard = totalConstructionYard;
	}
	public ArrayList<BuildingDetails> getBulidList() {
		return bulidList;
	}
	public void setBulidList(ArrayList<BuildingDetails> bulidList) {
		this.bulidList = bulidList;
	}
	 
	public String getStateGovtPropertyOffice() {
		return StateGovtPropertyOffice;
	}
	public void setStateGovtPropertyOffice(String stateGovtPropertyOffice) {
		StateGovtPropertyOffice = stateGovtPropertyOffice;
	}
	public String getReligiousPlace() {
		return ReligiousPlace;
	}
	public void setReligiousPlace(String religiousPlace) {
		ReligiousPlace = religiousPlace;
	}
	public String getResidential() {
		return Residential;
	}
	public void setResidential(String residential) {
		Residential = residential;
	}
	public String getOthers() {
		return Others;
	}
	public void setOthers(String others) {
		Others = others;
	}
 
	public String getWhetherpayUdTax_ACNo() {
		return WhetherpayUdTax_ACNo;
	}
	public void setWhetherpayUdTax_ACNo(String whetherpayUdTax_ACNo) {
		WhetherpayUdTax_ACNo = whetherpayUdTax_ACNo;
	}
	public String getWhetherpayLeaseTax_ACNo() {
		return WhetherpayLeaseTax_ACNo;
	}
	public void setWhetherpayLeaseTax_ACNo(String whetherpayLeaseTax_ACNo) {
		WhetherpayLeaseTax_ACNo = whetherpayLeaseTax_ACNo;
	}
	public String getPleaseWriteSizefBoardSqft() {
		return PleaseWriteSizefBoardSqft;
	}
	public void setPleaseWriteSizefBoardSqft(String pleaseWriteSizefBoardSqft) {
		PleaseWriteSizefBoardSqft = pleaseWriteSizefBoardSqft;
	}
	public String getNameOfSurveyor() {
		return NameOfSurveyor;
	}
	public void setNameOfSurveyor(String nameOfSurveyor) {
		NameOfSurveyor = nameOfSurveyor;
	}
	public String getSurveyorAddress() {
		return SurveyorAddress;
	}
	public void setSurveyorAddress(String surveyorAddress) {
		SurveyorAddress = surveyorAddress;
	}
	public String getIdCodeOfSurveyor() {
		return IdCodeOfSurveyor;
	}
	public void setIdCodeOfSurveyor(String idCodeOfSurveyor) {
		IdCodeOfSurveyor = idCodeOfSurveyor;
	}
	public String getDate_Surveyor() {
		return Date_Surveyor;
	}
	public void setDate_Surveyor(String date_Surveyor) {
		Date_Surveyor = date_Surveyor;
	}
	/*public String getNameOfAttestingAuthority() {
		return NameOfAttestingAuthority;
	}
	public void setNameOfAttestingAuthority(String nameOfAttestingAuthority) {
		NameOfAttestingAuthority = nameOfAttestingAuthority;
	}*/
	/*public String getDesignationOfAttestingAuthority() {
		return DesignationOfAttestingAuthority;
	}
	public void setDesignationOfAttestingAuthority(
			String designationOfAttestingAuthority) {
		DesignationOfAttestingAuthority = designationOfAttestingAuthority;
	}
	public String getDate_Attesting() {
		return Date_Attesting;
	}
	public void setDate_Attesting(String date_Attesting) {
		Date_Attesting = date_Attesting;
	}*/
	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public String getLandmark() {
		return Landmark;
	}


	public void setLandmark(String landmark) {
		Landmark = landmark;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getDharmashala() {
		return dharmashala;
	}


	public void setDharmashala(String dharmashala) {
		this.dharmashala = dharmashala;
	}


	public String getUserID() {
		return userID;
	}


	public void setUserID(String userID) {
		this.userID = userID;
	}


	public String getIsSameAddress() {
		return isSameAddress;
	}


	public void setIsSameAddress(String isSameAddress) {
		this.isSameAddress = isSameAddress;
	}



}
