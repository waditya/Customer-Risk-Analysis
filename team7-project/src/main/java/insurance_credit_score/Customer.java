package insurance_credit_score;

import org.bson.Document;

public class Customer {
	
	Document customerDoc;
	
	Double  Product_Info_1;
	Double  Product_Info_2;
	Double  Product_Info_3;
	Double  Product_Info_4;
	Double  Product_Info_5;
	Double  Product_Info_6;
	Double  Product_Info_7;
	Double  Ins_Age;
	Double  Ht;
	Double  Wt;
	Double  BMI;
	Double  Employment_Info_1;
	Double  Employment_Info_2;
	Double  Employment_Info_3;
	Double  Employment_Info_4;
	Double  Employment_Info_5;
	Double  Employment_Info_6;
	Double  InsuredInfo_1;
	Double  InsuredInfo_2;
	Double  InsuredInfo_3;
	Double  InsuredInfo_4;
	Double  InsuredInfo_5;
	Double  InsuredInfo_6;
	Double  InsuredInfo_7;
	Double  Insurance_History_1;
	Double  Insurance_History_2;
	Double  Insurance_History_3;
	Double  Insurance_History_4;
	Double  Insurance_History_5;
	Double  Insurance_History_7;
	Double  Insurance_History_8;
	Double  Insurance_History_9;
	Double  Family_Hist_1;
	Double  Family_Hist_2;
	Double  Family_Hist_3;
	Double  Family_Hist_4;
	Double  Family_Hist_5;
	Double  Medical_History_1;
	Double  Medical_History_2;
	Double  Medical_History_3;
	Double  Medical_History_4;
	Double  Medical_History_5;
	Double  Medical_History_6;
	Double  Medical_History_7;
	Double  Medical_History_8;
	Double  Medical_History_9;
	Double  Medical_History_10;
	Double  Medical_History_11;
	Double  Medical_History_12;
	Double  Medical_History_13;
	Double  Medical_History_14;
	Double  Medical_History_15;
	Double  Medical_History_16;
	Double  Medical_History_17;
	Double  Medical_History_18;
	Double  Medical_History_19;
	Double  Medical_History_20;
	Double  Medical_History_21;
	Double  Medical_History_22;
	Double  Medical_History_23;
	Double  Medical_History_24;
	Double  Medical_History_25;
	Double  Medical_History_26;
	Double  Medical_History_27;
	Double  Medical_History_28;
	Double  Medical_History_29;
	Double  Medical_History_30;
	Double  Medical_History_31;
	Double  Medical_History_32;
	Double  Medical_History_33;
	Double  Medical_History_34;
	Double  Medical_History_35;
	Double  Medical_History_36;
	Double  Medical_History_37;
	Double  Medical_History_38;
	Double  Medical_History_39;
	Double  Medical_History_40;
	Double  Medical_History_41;
	Double  Medical_Keyword_1;
	Double  Medical_Keyword_2;
	Double  Medical_Keyword_3;
	Double  Medical_Keyword_4;
	Double  Medical_Keyword_5;
	Double  Medical_Keyword_6;
	Double  Medical_Keyword_7;
	Double  Medical_Keyword_8;
	Double  Medical_Keyword_9;
	Double  Medical_Keyword_10;
	Double  Medical_Keyword_11;
	Double  Medical_Keyword_12;
	Double  Medical_Keyword_13;
	Double  Medical_Keyword_14;
	Double  Medical_Keyword_15;
	Double  Medical_Keyword_16;
	Double  Medical_Keyword_17;
	Double  Medical_Keyword_18;
	Double  Medical_Keyword_19;
	Double  Medical_Keyword_20;
	Double  Medical_Keyword_21;
	Double  Medical_Keyword_22;
	Double  Medical_Keyword_23;
	Double  Medical_Keyword_24;
	Double  Medical_Keyword_25;
	Double  Medical_Keyword_26;
	Double  Medical_Keyword_27;
	Double  Medical_Keyword_28;
	Double  Medical_Keyword_29;
	Double  Medical_Keyword_30;
	Double  Medical_Keyword_31;
	Double  Medical_Keyword_32;
	Double  Medical_Keyword_33;
	Double  Medical_Keyword_34;
	Double  Medical_Keyword_35;
	Double  Medical_Keyword_36;
	Double  Medical_Keyword_37;
	Double  Medical_Keyword_38;
	Double  Medical_Keyword_39;
	Double  Medical_Keyword_40;
	Double  Medical_Keyword_41;
	Double  Medical_Keyword_42;
	Double  Medical_Keyword_43;
	Double  Medical_Keyword_44;
	Double  Medical_Keyword_45;
	Double  Medical_Keyword_46;
	Double  Medical_Keyword_47;
	Double  Medical_Keyword_48;
	
	public Customer(Document customerDoc) {
		super();
		this.customerDoc = customerDoc;
	}
	
	public void calculateCustomerMetrics() {
		this.Product_Info_1 = Double.valueOf(customerDoc.getString("Product_Info_1"));
		//this.Product_Info_2 = Double.valueOf(customerDoc.getString("Product_Info_2"));
		this.Product_Info_2 = 0.0;
		this.Product_Info_3 = Double.valueOf(customerDoc.getString("Product_Info_3"));
		this.Product_Info_4 = Double.valueOf(customerDoc.getString("Product_Info_4"));
		this.Product_Info_5 = Double.valueOf(customerDoc.getString("Product_Info_5"));
		this.Product_Info_6 = Double.valueOf(customerDoc.getString("Product_Info_6"));
		this.Product_Info_7 = Double.valueOf(customerDoc.getString("Product_Info_7"));
		
		this.Ins_Age = Double.valueOf(customerDoc.getString("Ins_Age"));
		this.Ht = Double.valueOf(customerDoc.getString("Ht"));
		this.Wt = Double.valueOf(customerDoc.getString("Wt"));
		this.BMI = Double.valueOf(customerDoc.getString("BMI"));
		
		
		this.Employment_Info_1 = Double.valueOf(replaceBlank(customerDoc.getString("Employment_Info_1")));
		this.Employment_Info_2 = Double.valueOf(replaceBlank(customerDoc.getString("Employment_Info_2")));
		this.Employment_Info_3 = Double.valueOf(replaceBlank(customerDoc.getString("Employment_Info_3")));
		this.Employment_Info_4 = Double.valueOf(replaceBlank(customerDoc.getString("Employment_Info_4")));
		this.Employment_Info_5 = Double.valueOf(replaceBlank(customerDoc.getString("Employment_Info_5")));
		this.Employment_Info_6 = Double.valueOf(replaceBlank(customerDoc.getString("Employment_Info_6")));
		
		this.InsuredInfo_1 = Double.valueOf(replaceBlank(customerDoc.getString("InsuredInfo_1")));
		this.InsuredInfo_2 = Double.valueOf(replaceBlank(customerDoc.getString("InsuredInfo_2")));
		this.InsuredInfo_3 = Double.valueOf(replaceBlank(customerDoc.getString("InsuredInfo_3")));
		this.InsuredInfo_4 = Double.valueOf(replaceBlank(customerDoc.getString("InsuredInfo_4")));
		this.InsuredInfo_5 = Double.valueOf(replaceBlank(customerDoc.getString("InsuredInfo_5")));
		this.InsuredInfo_6 = Double.valueOf(replaceBlank(customerDoc.getString("InsuredInfo_6")));
		this.InsuredInfo_7 = Double.valueOf(replaceBlank(customerDoc.getString("InsuredInfo_7")));
		
		this.Insurance_History_1 = Double.valueOf(replaceBlank(customerDoc.getString("Insurance_History_1")));
		this.Insurance_History_2 = Double.valueOf(replaceBlank(customerDoc.getString("Insurance_History_2")));
		this.Insurance_History_3 = Double.valueOf(replaceBlank(customerDoc.getString("Insurance_History_3")));
		this.Insurance_History_4 = Double.valueOf(replaceBlank(customerDoc.getString("Insurance_History_4")));
		this.Insurance_History_5 = Double.valueOf(replaceBlank(customerDoc.getString("Insurance_History_5")));
		this.Insurance_History_7 = Double.valueOf(replaceBlank(customerDoc.getString("Insurance_History_7")));
		this.Insurance_History_8 = Double.valueOf(replaceBlank(customerDoc.getString("Insurance_History_8")));
		this.Insurance_History_9 = Double.valueOf(replaceBlank(customerDoc.getString("Insurance_History_9")));
		
		
		this.Family_Hist_1 = Double.valueOf(replaceBlank(customerDoc.getString("Family_Hist_1")));
		this.Family_Hist_2 = Double.valueOf(replaceBlank(customerDoc.getString("Family_Hist_2")));
		this.Family_Hist_3 = Double.valueOf(replaceBlank(customerDoc.getString("Family_Hist_3")));
		this.Family_Hist_4 = Double.valueOf(replaceBlank(customerDoc.getString("Family_Hist_4")));
		this.Family_Hist_5 = Double.valueOf(replaceBlank(customerDoc.getString("Family_Hist_5")));
		
		
		
		
		
		
		this.Medical_History_1 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_History_1")));
		this.Medical_History_2 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_History_2")));
		this.Medical_History_3 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_History_3")));
		this.Medical_History_4 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_History_4")));
		this.Medical_History_5 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_History_5")));
		this.Medical_History_6 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_History_6")));
		this.Medical_History_7 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_History_7")));
		this.Medical_History_8 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_History_8")));
		this.Medical_History_9 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_History_9")));
		this.Medical_History_10 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_History_10")));
		this.Medical_History_11 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_History_11")));
		this.Medical_History_12 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_History_12")));
		this.Medical_History_13 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_History_13")));
		this.Medical_History_14 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_History_14")));
		this.Medical_History_15 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_History_15")));
		this.Medical_History_16 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_History_16")));
		this.Medical_History_17 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_History_17")));
		this.Medical_History_18 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_History_18")));
		this.Medical_History_19 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_History_19")));
		this.Medical_History_20 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_History_20")));
		this.Medical_History_21 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_History_21")));
		this.Medical_History_22 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_History_22")));
		this.Medical_History_23 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_History_23")));
		this.Medical_History_24 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_History_24")));
		this.Medical_History_25 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_History_25")));
		this.Medical_History_26 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_History_26")));
		this.Medical_History_27 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_History_27")));
		this.Medical_History_28 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_History_28")));
		this.Medical_History_29 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_History_29")));
		this.Medical_History_30 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_History_30")));
		this.Medical_History_31 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_History_31")));
		this.Medical_History_32 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_History_32")));
		this.Medical_History_33 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_History_33")));
		this.Medical_History_34 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_History_34")));
		this.Medical_History_35 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_History_35")));
		this.Medical_History_36 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_History_36")));
		this.Medical_History_37 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_History_37")));
		this.Medical_History_38 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_History_38")));
		this.Medical_History_39 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_History_39")));
		this.Medical_History_40 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_History_40")));
		this.Medical_History_41 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_History_41")));
		
		this.Medical_Keyword_1 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_Keyword_1")));
		this.Medical_Keyword_2 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_Keyword_2")));
		this.Medical_Keyword_3 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_Keyword_3")));
		this.Medical_Keyword_4 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_Keyword_4")));
		this.Medical_Keyword_5 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_Keyword_5")));
		this.Medical_Keyword_6 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_Keyword_6")));
		this.Medical_Keyword_7 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_Keyword_7")));
		this.Medical_Keyword_8 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_Keyword_8")));
		this.Medical_Keyword_9 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_Keyword_9")));
		this.Medical_Keyword_10 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_Keyword_10")));
		
		
		
		
		
		this.Medical_Keyword_11 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_Keyword_11")));
		this.Medical_Keyword_12 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_Keyword_12")));
		this.Medical_Keyword_13 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_Keyword_13")));
		this.Medical_Keyword_14 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_Keyword_14")));
		this.Medical_Keyword_15 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_Keyword_15")));
		this.Medical_Keyword_16 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_Keyword_16")));
		this.Medical_Keyword_17 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_Keyword_17")));
		this.Medical_Keyword_18 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_Keyword_18")));
		this.Medical_Keyword_19 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_Keyword_19")));
		this.Medical_Keyword_20 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_Keyword_20")));
		this.Medical_Keyword_21 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_Keyword_21")));
		this.Medical_Keyword_22 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_Keyword_22")));
		this.Medical_Keyword_23 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_Keyword_23")));
		this.Medical_Keyword_24 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_Keyword_24")));
		this.Medical_Keyword_25 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_Keyword_25")));
		this.Medical_Keyword_26 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_Keyword_26")));
		this.Medical_Keyword_27 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_Keyword_27")));
		this.Medical_Keyword_28 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_Keyword_28")));
		this.Medical_Keyword_29 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_Keyword_29")));
		this.Medical_Keyword_30 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_Keyword_30")));
		this.Medical_Keyword_31 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_Keyword_31")));
		this.Medical_Keyword_32 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_Keyword_32")));
		this.Medical_Keyword_33 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_Keyword_33")));
		this.Medical_Keyword_34 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_Keyword_34")));
		this.Medical_Keyword_35 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_Keyword_35")));
		this.Medical_Keyword_36 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_Keyword_36")));
		this.Medical_Keyword_37 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_Keyword_37")));
		this.Medical_Keyword_38 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_Keyword_38")));
		this.Medical_Keyword_39 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_Keyword_39")));
		this.Medical_Keyword_40 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_Keyword_40")));
		this.Medical_Keyword_41 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_Keyword_41")));
		this.Medical_Keyword_42 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_Keyword_42")));
		this.Medical_Keyword_43 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_Keyword_43")));
		this.Medical_Keyword_44 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_Keyword_44")));
		this.Medical_Keyword_45 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_Keyword_45")));
		this.Medical_Keyword_46 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_Keyword_46")));
		this.Medical_Keyword_47 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_Keyword_47")));
		this.Medical_Keyword_48 = Double.valueOf(replaceBlank(customerDoc.getString("Medical_Keyword_48")));
 
	}
	
	public String replaceBlank(String keyword) {
		if(keyword.equals("")) {
			 return ("0.0");
		}else {
			return keyword;
		}
		
	}
	
	

}
