package insurance_credit_score;

import org.bson.Document;

public class Coefficient {
	
	Document coeffDocument;
	
	Double cf_Product_Info_1;
	Double cf_Product_Info_2;
	Double cf_Product_Info_3;
	Double cf_Product_Info_4;
	Double cf_Product_Info_5;
	Double cf_Product_Info_6;
	Double cf_Product_Info_7;
	Double cf_Ins_Age;
	Double cf_Ht;
	Double cf_Wt;
	Double cf_BMI;
	Double cf_Employment_Info_1;
	Double cf_Employment_Info_2;
	Double cf_Employment_Info_3;
	Double cf_Employment_Info_4;
	Double cf_Employment_Info_5;
	Double cf_Employment_Info_6;
	Double cf_InsuredInfo_1;
	Double cf_InsuredInfo_2;
	Double cf_InsuredInfo_3;
	Double cf_InsuredInfo_4;
	Double cf_InsuredInfo_5;
	Double cf_InsuredInfo_6;
	Double cf_InsuredInfo_7;
	Double cf_Insurance_History_1;
	Double cf_Insurance_History_2;
	Double cf_Insurance_History_3;
	Double cf_Insurance_History_4;
	Double cf_Insurance_History_5;
	Double cf_Insurance_History_7;
	Double cf_Insurance_History_8;
	Double cf_Insurance_History_9;
	Double cf_Family_Hist_1;
	Double cf_Family_Hist_2;
	Double cf_Family_Hist_3;
	Double cf_Family_Hist_4;
	Double cf_Family_Hist_5;
	Double cf_Medical_History_1;
	Double cf_Medical_History_2;
	Double cf_Medical_History_3;
	Double cf_Medical_History_4;
	Double cf_Medical_History_5;
	Double cf_Medical_History_6;
	Double cf_Medical_History_7;
	Double cf_Medical_History_8;
	Double cf_Medical_History_9;
	Double cf_Medical_History_10;
	Double cf_Medical_History_11;
	Double cf_Medical_History_12;
	Double cf_Medical_History_13;
	Double cf_Medical_History_14;
	Double cf_Medical_History_15;
	Double cf_Medical_History_16;
	Double cf_Medical_History_17;
	Double cf_Medical_History_18;
	Double cf_Medical_History_19;
	Double cf_Medical_History_20;
	Double cf_Medical_History_21;
	Double cf_Medical_History_22;
	Double cf_Medical_History_23;
	Double cf_Medical_History_24;
	Double cf_Medical_History_25;
	Double cf_Medical_History_26;
	Double cf_Medical_History_27;
	Double cf_Medical_History_28;
	Double cf_Medical_History_29;
	Double cf_Medical_History_30;
	Double cf_Medical_History_31;
	Double cf_Medical_History_32;
	Double cf_Medical_History_33;
	Double cf_Medical_History_34;
	Double cf_Medical_History_35;
	Double cf_Medical_History_36;
	Double cf_Medical_History_37;
	Double cf_Medical_History_38;
	Double cf_Medical_History_39;
	Double cf_Medical_History_40;
	Double cf_Medical_History_41;
	Double cf_Medical_Keyword_1;
	Double cf_Medical_Keyword_2;
	Double cf_Medical_Keyword_3;
	Double cf_Medical_Keyword_4;
	Double cf_Medical_Keyword_5;
	Double cf_Medical_Keyword_6;
	Double cf_Medical_Keyword_7;
	Double cf_Medical_Keyword_8;
	Double cf_Medical_Keyword_9;
	Double cf_Medical_Keyword_10;
	Double cf_Medical_Keyword_11;
	Double cf_Medical_Keyword_12;
	Double cf_Medical_Keyword_13;
	Double cf_Medical_Keyword_14;
	Double cf_Medical_Keyword_15;
	Double cf_Medical_Keyword_16;
	Double cf_Medical_Keyword_17;
	Double cf_Medical_Keyword_18;
	Double cf_Medical_Keyword_19;
	Double cf_Medical_Keyword_20;
	Double cf_Medical_Keyword_21;
	Double cf_Medical_Keyword_22;
	Double cf_Medical_Keyword_23;
	Double cf_Medical_Keyword_24;
	Double cf_Medical_Keyword_25;
	Double cf_Medical_Keyword_26;
	Double cf_Medical_Keyword_27;
	Double cf_Medical_Keyword_28;
	Double cf_Medical_Keyword_29;
	Double cf_Medical_Keyword_30;
	Double cf_Medical_Keyword_31;
	Double cf_Medical_Keyword_32;
	Double cf_Medical_Keyword_33;
	Double cf_Medical_Keyword_34;
	Double cf_Medical_Keyword_35;
	Double cf_Medical_Keyword_36;
	Double cf_Medical_Keyword_37;
	Double cf_Medical_Keyword_38;
	Double cf_Medical_Keyword_39;
	Double cf_Medical_Keyword_40;
	Double cf_Medical_Keyword_41;
	Double cf_Medical_Keyword_42;
	Double cf_Medical_Keyword_43;
	Double cf_Medical_Keyword_44;
	Double cf_Medical_Keyword_45;
	Double cf_Medical_Keyword_46;
	Double cf_Medical_Keyword_47;
	Double cf_Medical_Keyword_48;
	
	public Coefficient(Document coeffDocument) {
		super();
		this.coeffDocument = coeffDocument;		
		 
	}
	
	public void calculateCoefficients() {
		this.cf_Product_Info_1 = Double.valueOf(coeffDocument.getString("Product_Info_1"));
		this.cf_Product_Info_2 = Double.valueOf(coeffDocument.getString("Product_Info_2"));
		this.cf_Product_Info_3 = Double.valueOf(coeffDocument.getString("Product_Info_3"));
		this.cf_Product_Info_4 = Double.valueOf(coeffDocument.getString("Product_Info_4"));
		this.cf_Product_Info_5 = Double.valueOf(coeffDocument.getString("Product_Info_5"));
		this.cf_Product_Info_6 = Double.valueOf(coeffDocument.getString("Product_Info_6"));
		this.cf_Product_Info_7 = Double.valueOf(coeffDocument.getString("Product_Info_7"));
		this.cf_Ins_Age = Double.valueOf(coeffDocument.getString("Ins_Age"));
		this.cf_Ht = Double.valueOf(coeffDocument.getString("Ht"));
		this.cf_Wt = Double.valueOf(coeffDocument.getString("Wt"));
		this.cf_BMI = Double.valueOf(coeffDocument.getString("BMI"));
		this.cf_Employment_Info_1 = Double.valueOf(coeffDocument.getString("Employment_Info_1"));
		this.cf_Employment_Info_2 = Double.valueOf(coeffDocument.getString("Employment_Info_2"));
		this.cf_Employment_Info_3 = Double.valueOf(coeffDocument.getString("Employment_Info_3"));
		this.cf_Employment_Info_4 = Double.valueOf(coeffDocument.getString("Employment_Info_4"));
		this.cf_Employment_Info_5 = Double.valueOf(coeffDocument.getString("Employment_Info_5"));
		this.cf_Employment_Info_6 = Double.valueOf(coeffDocument.getString("Employment_Info_6"));
		this.cf_InsuredInfo_1 = Double.valueOf(coeffDocument.getString("InsuredInfo_1"));
		this.cf_InsuredInfo_2 = Double.valueOf(coeffDocument.getString("InsuredInfo_2"));
		this.cf_InsuredInfo_3 = Double.valueOf(coeffDocument.getString("InsuredInfo_3"));
		this.cf_InsuredInfo_4 = Double.valueOf(coeffDocument.getString("InsuredInfo_4"));
		this.cf_InsuredInfo_5 = Double.valueOf(coeffDocument.getString("InsuredInfo_5"));
		this.cf_InsuredInfo_6 = Double.valueOf(coeffDocument.getString("InsuredInfo_6"));
		this.cf_InsuredInfo_7 = Double.valueOf(coeffDocument.getString("InsuredInfo_7"));
		this.cf_Insurance_History_1 = Double.valueOf(coeffDocument.getString("Insurance_History_1"));
		this.cf_Insurance_History_2 = Double.valueOf(coeffDocument.getString("Insurance_History_2"));
		this.cf_Insurance_History_3 = Double.valueOf(coeffDocument.getString("Insurance_History_3"));
		this.cf_Insurance_History_4 = Double.valueOf(coeffDocument.getString("Insurance_History_4"));
		this.cf_Insurance_History_5 = Double.valueOf(coeffDocument.getString("Insurance_History_5"));
		this.cf_Insurance_History_7 = Double.valueOf(coeffDocument.getString("Insurance_History_7"));
		this.cf_Insurance_History_8 = Double.valueOf(coeffDocument.getString("Insurance_History_8"));
		this.cf_Insurance_History_9 = Double.valueOf(coeffDocument.getString("Insurance_History_9"));
		this.cf_Family_Hist_1 = Double.valueOf(coeffDocument.getString("Family_Hist_1"));
		this.cf_Family_Hist_2 = Double.valueOf(coeffDocument.getString("Family_Hist_2"));
		this.cf_Family_Hist_3 = Double.valueOf(coeffDocument.getString("Family_Hist_3"));
		this.cf_Family_Hist_4 = Double.valueOf(coeffDocument.getString("Family_Hist_4"));
		this.cf_Family_Hist_5 = Double.valueOf(coeffDocument.getString("Family_Hist_5"));
		this.cf_Medical_History_1 = Double.valueOf(coeffDocument.getString("Medical_History_1"));
		this.cf_Medical_History_2 = Double.valueOf(coeffDocument.getString("Medical_History_2"));
		this.cf_Medical_History_3 = Double.valueOf(coeffDocument.getString("Medical_History_3"));
		this.cf_Medical_History_4 = Double.valueOf(coeffDocument.getString("Medical_History_4"));
		this.cf_Medical_History_5 = Double.valueOf(coeffDocument.getString("Medical_History_5"));
		this.cf_Medical_History_6 = Double.valueOf(coeffDocument.getString("Medical_History_6"));
		this.cf_Medical_History_7 = Double.valueOf(coeffDocument.getString("Medical_History_7"));
		this.cf_Medical_History_8 = Double.valueOf(coeffDocument.getString("Medical_History_8"));
		this.cf_Medical_History_9 = Double.valueOf(coeffDocument.getString("Medical_History_9"));
		this.cf_Medical_History_10 = Double.valueOf(coeffDocument.getString("Medical_History_10"));
		this.cf_Medical_History_11 = Double.valueOf(coeffDocument.getString("Medical_History_11"));
		this.cf_Medical_History_12 = Double.valueOf(coeffDocument.getString("Medical_History_12"));
		this.cf_Medical_History_13 = Double.valueOf(coeffDocument.getString("Medical_History_13"));
		this.cf_Medical_History_14 = Double.valueOf(coeffDocument.getString("Medical_History_14"));
		this.cf_Medical_History_15 = Double.valueOf(coeffDocument.getString("Medical_History_15"));
		this.cf_Medical_History_16 = Double.valueOf(coeffDocument.getString("Medical_History_16"));
		this.cf_Medical_History_17 = Double.valueOf(coeffDocument.getString("Medical_History_17"));
		this.cf_Medical_History_18 = Double.valueOf(coeffDocument.getString("Medical_History_18"));
		this.cf_Medical_History_19 = Double.valueOf(coeffDocument.getString("Medical_History_19"));
		this.cf_Medical_History_20 = Double.valueOf(coeffDocument.getString("Medical_History_20"));
		this.cf_Medical_History_21 = Double.valueOf(coeffDocument.getString("Medical_History_21"));
		this.cf_Medical_History_22 = Double.valueOf(coeffDocument.getString("Medical_History_22"));
		this.cf_Medical_History_23 = Double.valueOf(coeffDocument.getString("Medical_History_23"));
		this.cf_Medical_History_24 = Double.valueOf(coeffDocument.getString("Medical_History_24"));
		this.cf_Medical_History_25 = Double.valueOf(coeffDocument.getString("Medical_History_25"));
		this.cf_Medical_History_26 = Double.valueOf(coeffDocument.getString("Medical_History_26"));
		this.cf_Medical_History_27 = Double.valueOf(coeffDocument.getString("Medical_History_27"));
		this.cf_Medical_History_28 = Double.valueOf(coeffDocument.getString("Medical_History_28"));
		this.cf_Medical_History_29 = Double.valueOf(coeffDocument.getString("Medical_History_29"));
		this.cf_Medical_History_30 = Double.valueOf(coeffDocument.getString("Medical_History_30"));
		this.cf_Medical_History_31 = Double.valueOf(coeffDocument.getString("Medical_History_31"));
		this.cf_Medical_History_32 = Double.valueOf(coeffDocument.getString("Medical_History_32"));
		this.cf_Medical_History_33 = Double.valueOf(coeffDocument.getString("Medical_History_33"));
		this.cf_Medical_History_34 = Double.valueOf(coeffDocument.getString("Medical_History_34"));
		this.cf_Medical_History_35 = Double.valueOf(coeffDocument.getString("Medical_History_35"));
		this.cf_Medical_History_36 = Double.valueOf(coeffDocument.getString("Medical_History_36"));
		this.cf_Medical_History_37 = Double.valueOf(coeffDocument.getString("Medical_History_37"));
		this.cf_Medical_History_38 = Double.valueOf(coeffDocument.getString("Medical_History_38"));
		this.cf_Medical_History_39 = Double.valueOf(coeffDocument.getString("Medical_History_39"));
		this.cf_Medical_History_40 = Double.valueOf(coeffDocument.getString("Medical_History_40"));
		this.cf_Medical_History_41 = Double.valueOf(coeffDocument.getString("Medical_History_41"));
		this.cf_Medical_Keyword_1 = Double.valueOf(coeffDocument.getString("Medical_Keyword_1"));
		this.cf_Medical_Keyword_2 = Double.valueOf(coeffDocument.getString("Medical_Keyword_2"));
		this.cf_Medical_Keyword_3 = Double.valueOf(coeffDocument.getString("Medical_Keyword_3"));
		this.cf_Medical_Keyword_4 = Double.valueOf(coeffDocument.getString("Medical_Keyword_4"));
		this.cf_Medical_Keyword_5 = Double.valueOf(coeffDocument.getString("Medical_Keyword_5"));
		this.cf_Medical_Keyword_6 = Double.valueOf(coeffDocument.getString("Medical_Keyword_6"));
		this.cf_Medical_Keyword_7 = Double.valueOf(coeffDocument.getString("Medical_Keyword_7"));
		this.cf_Medical_Keyword_8 = Double.valueOf(coeffDocument.getString("Medical_Keyword_8"));
		this.cf_Medical_Keyword_9 = Double.valueOf(coeffDocument.getString("Medical_Keyword_9"));
		this.cf_Medical_Keyword_10 = Double.valueOf(coeffDocument.getString("Medical_Keyword_10"));
		this.cf_Medical_Keyword_11 = Double.valueOf(coeffDocument.getString("Medical_Keyword_11"));
		this.cf_Medical_Keyword_12 = Double.valueOf(coeffDocument.getString("Medical_Keyword_12"));
		this.cf_Medical_Keyword_13 = Double.valueOf(coeffDocument.getString("Medical_Keyword_13"));
		this.cf_Medical_Keyword_14 = Double.valueOf(coeffDocument.getString("Medical_Keyword_14"));
		this.cf_Medical_Keyword_15 = Double.valueOf(coeffDocument.getString("Medical_Keyword_15"));
		this.cf_Medical_Keyword_16 = Double.valueOf(coeffDocument.getString("Medical_Keyword_16"));
		this.cf_Medical_Keyword_17 = Double.valueOf(coeffDocument.getString("Medical_Keyword_17"));
		this.cf_Medical_Keyword_18 = Double.valueOf(coeffDocument.getString("Medical_Keyword_18"));
		this.cf_Medical_Keyword_19 = Double.valueOf(coeffDocument.getString("Medical_Keyword_19"));
		this.cf_Medical_Keyword_20 = Double.valueOf(coeffDocument.getString("Medical_Keyword_20"));
		this.cf_Medical_Keyword_21 = Double.valueOf(coeffDocument.getString("Medical_Keyword_21"));
		this.cf_Medical_Keyword_22 = Double.valueOf(coeffDocument.getString("Medical_Keyword_22"));
		this.cf_Medical_Keyword_23 = Double.valueOf(coeffDocument.getString("Medical_Keyword_23"));
		this.cf_Medical_Keyword_24 = Double.valueOf(coeffDocument.getString("Medical_Keyword_24"));
		this.cf_Medical_Keyword_25 = Double.valueOf(coeffDocument.getString("Medical_Keyword_25"));
		this.cf_Medical_Keyword_26 = Double.valueOf(coeffDocument.getString("Medical_Keyword_26"));
		this.cf_Medical_Keyword_27 = Double.valueOf(coeffDocument.getString("Medical_Keyword_27"));
		this.cf_Medical_Keyword_28 = Double.valueOf(coeffDocument.getString("Medical_Keyword_28"));
		this.cf_Medical_Keyword_29 = Double.valueOf(coeffDocument.getString("Medical_Keyword_29"));
		this.cf_Medical_Keyword_30 = Double.valueOf(coeffDocument.getString("Medical_Keyword_30"));
		this.cf_Medical_Keyword_31 = Double.valueOf(coeffDocument.getString("Medical_Keyword_31"));
		this.cf_Medical_Keyword_32 = Double.valueOf(coeffDocument.getString("Medical_Keyword_32"));
		this.cf_Medical_Keyword_33 = Double.valueOf(coeffDocument.getString("Medical_Keyword_33"));
		this.cf_Medical_Keyword_34 = Double.valueOf(coeffDocument.getString("Medical_Keyword_34"));
		this.cf_Medical_Keyword_35 = Double.valueOf(coeffDocument.getString("Medical_Keyword_35"));
		this.cf_Medical_Keyword_36 = Double.valueOf(coeffDocument.getString("Medical_Keyword_36"));
		this.cf_Medical_Keyword_37 = Double.valueOf(coeffDocument.getString("Medical_Keyword_37"));
		this.cf_Medical_Keyword_38 = Double.valueOf(coeffDocument.getString("Medical_Keyword_38"));
		this.cf_Medical_Keyword_39 = Double.valueOf(coeffDocument.getString("Medical_Keyword_39"));
		this.cf_Medical_Keyword_40 = Double.valueOf(coeffDocument.getString("Medical_Keyword_40"));
		this.cf_Medical_Keyword_41 = Double.valueOf(coeffDocument.getString("Medical_Keyword_41"));
		this.cf_Medical_Keyword_42 = Double.valueOf(coeffDocument.getString("Medical_Keyword_42"));
		this.cf_Medical_Keyword_43 = Double.valueOf(coeffDocument.getString("Medical_Keyword_43"));
		this.cf_Medical_Keyword_44 = Double.valueOf(coeffDocument.getString("Medical_Keyword_44"));
		this.cf_Medical_Keyword_45 = Double.valueOf(coeffDocument.getString("Medical_Keyword_45"));
		this.cf_Medical_Keyword_46 = Double.valueOf(coeffDocument.getString("Medical_Keyword_46"));
		this.cf_Medical_Keyword_47 = Double.valueOf(coeffDocument.getString("Medical_Keyword_47"));
		this.cf_Medical_Keyword_48 = Double.valueOf(coeffDocument.getString("Medical_Keyword_48"));
		


	}
	
	
	
	
	
	
	
	

}