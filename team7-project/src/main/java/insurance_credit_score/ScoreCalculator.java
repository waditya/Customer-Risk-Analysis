package insurance_credit_score;

public class ScoreCalculator {

	public double CalculateScore( Customer custDoc , Coefficient coeffDoc) {

		//String message="Initial Message";
		
		//double riskScore = ageScore*0.4 + bmi*0.3 + employment*0.3;
		double riskScore = custDoc.Product_Info_1 * coeffDoc.cf_Product_Info_1 +
				custDoc.Product_Info_2 * coeffDoc.cf_Product_Info_2 +
				custDoc.Product_Info_3 * coeffDoc.cf_Product_Info_3 +
				custDoc.Product_Info_4 * coeffDoc.cf_Product_Info_4 +
				custDoc.Product_Info_5 * coeffDoc.cf_Product_Info_5 +
				custDoc.Product_Info_6 * coeffDoc.cf_Product_Info_6 +
				custDoc.Product_Info_7 * coeffDoc.cf_Product_Info_7 +
				custDoc.Ins_Age * coeffDoc.cf_Ins_Age +
				custDoc.Ht * coeffDoc.cf_Ht +
				custDoc.Wt * coeffDoc.cf_Wt +
				custDoc.BMI * coeffDoc.cf_BMI +
				custDoc.Employment_Info_1 * coeffDoc.cf_Employment_Info_1 +
				custDoc.Employment_Info_2 * coeffDoc.cf_Employment_Info_2 +
				custDoc.Employment_Info_3 * coeffDoc.cf_Employment_Info_3 +
				custDoc.Employment_Info_4 * coeffDoc.cf_Employment_Info_4 +
				custDoc.Employment_Info_5 * coeffDoc.cf_Employment_Info_5 +
				custDoc.Employment_Info_6 * coeffDoc.cf_Employment_Info_6 +
				custDoc.InsuredInfo_1 * coeffDoc.cf_InsuredInfo_1 +
				custDoc.InsuredInfo_2 * coeffDoc.cf_InsuredInfo_2 +
				custDoc.InsuredInfo_3 * coeffDoc.cf_InsuredInfo_3 +
				custDoc.InsuredInfo_4 * coeffDoc.cf_InsuredInfo_4 +
				custDoc.InsuredInfo_5 * coeffDoc.cf_InsuredInfo_5 +
				custDoc.InsuredInfo_6 * coeffDoc.cf_InsuredInfo_6 +
				custDoc.InsuredInfo_7 * coeffDoc.cf_InsuredInfo_7 +
				custDoc.Insurance_History_1 * coeffDoc.cf_Insurance_History_1 +
				custDoc.Insurance_History_2 * coeffDoc.cf_Insurance_History_2 +
				custDoc.Insurance_History_3 * coeffDoc.cf_Insurance_History_3 +
				custDoc.Insurance_History_4 * coeffDoc.cf_Insurance_History_4 +
				custDoc.Insurance_History_5 * coeffDoc.cf_Insurance_History_5 +
				custDoc.Insurance_History_7 * coeffDoc.cf_Insurance_History_7 +
				custDoc.Insurance_History_8 * coeffDoc.cf_Insurance_History_8 +
				custDoc.Insurance_History_9 * coeffDoc.cf_Insurance_History_9 +
				custDoc.Family_Hist_1 * coeffDoc.cf_Family_Hist_1 +
				custDoc.Family_Hist_2 * coeffDoc.cf_Family_Hist_2 +
				custDoc.Family_Hist_3 * coeffDoc.cf_Family_Hist_3 +
				custDoc.Family_Hist_4 * coeffDoc.cf_Family_Hist_4 +
				custDoc.Family_Hist_5 * coeffDoc.cf_Family_Hist_5 +
				custDoc.Medical_History_1 * coeffDoc.cf_Medical_History_1 +
				custDoc.Medical_History_2 * coeffDoc.cf_Medical_History_2 +
				custDoc.Medical_History_3 * coeffDoc.cf_Medical_History_3 +
				custDoc.Medical_History_4 * coeffDoc.cf_Medical_History_4 +
				custDoc.Medical_History_5 * coeffDoc.cf_Medical_History_5 +
				custDoc.Medical_History_6 * coeffDoc.cf_Medical_History_6 +
				custDoc.Medical_History_7 * coeffDoc.cf_Medical_History_7 +
				custDoc.Medical_History_8 * coeffDoc.cf_Medical_History_8 +
				custDoc.Medical_History_9 * coeffDoc.cf_Medical_History_9 +
				custDoc.Medical_History_10 * coeffDoc.cf_Medical_History_10 +
				custDoc.Medical_History_11 * coeffDoc.cf_Medical_History_11 +
				custDoc.Medical_History_12 * coeffDoc.cf_Medical_History_12 +
				custDoc.Medical_History_13 * coeffDoc.cf_Medical_History_13 +
				custDoc.Medical_History_14 * coeffDoc.cf_Medical_History_14 +
				custDoc.Medical_History_15 * coeffDoc.cf_Medical_History_15 +
				custDoc.Medical_History_16 * coeffDoc.cf_Medical_History_16 +
				custDoc.Medical_History_17 * coeffDoc.cf_Medical_History_17 +
				custDoc.Medical_History_18 * coeffDoc.cf_Medical_History_18 +
				custDoc.Medical_History_19 * coeffDoc.cf_Medical_History_19 +
				custDoc.Medical_History_20 * coeffDoc.cf_Medical_History_20 +
				custDoc.Medical_History_21 * coeffDoc.cf_Medical_History_21 +
				custDoc.Medical_History_22 * coeffDoc.cf_Medical_History_22 +
				custDoc.Medical_History_23 * coeffDoc.cf_Medical_History_23 +
				custDoc.Medical_History_24 * coeffDoc.cf_Medical_History_24 +
				custDoc.Medical_History_25 * coeffDoc.cf_Medical_History_25 +
				custDoc.Medical_History_26 * coeffDoc.cf_Medical_History_26 +
				custDoc.Medical_History_27 * coeffDoc.cf_Medical_History_27 +
				custDoc.Medical_History_28 * coeffDoc.cf_Medical_History_28 +
				custDoc.Medical_History_29 * coeffDoc.cf_Medical_History_29 +
				custDoc.Medical_History_30 * coeffDoc.cf_Medical_History_30 +
				custDoc.Medical_History_31 * coeffDoc.cf_Medical_History_31 +
				custDoc.Medical_History_32 * coeffDoc.cf_Medical_History_32 +
				custDoc.Medical_History_33 * coeffDoc.cf_Medical_History_33 +
				custDoc.Medical_History_34 * coeffDoc.cf_Medical_History_34 +
				custDoc.Medical_History_35 * coeffDoc.cf_Medical_History_35 +
				custDoc.Medical_History_36 * coeffDoc.cf_Medical_History_36 +
				custDoc.Medical_History_37 * coeffDoc.cf_Medical_History_37 +
				custDoc.Medical_History_38 * coeffDoc.cf_Medical_History_38 +
				custDoc.Medical_History_39 * coeffDoc.cf_Medical_History_39 +
				custDoc.Medical_History_40 * coeffDoc.cf_Medical_History_40 +
				custDoc.Medical_History_41 * coeffDoc.cf_Medical_History_41 +
				custDoc.Medical_Keyword_1 * coeffDoc.cf_Medical_Keyword_1 +
				custDoc.Medical_Keyword_2 * coeffDoc.cf_Medical_Keyword_2 +
				custDoc.Medical_Keyword_3 * coeffDoc.cf_Medical_Keyword_3 +
				custDoc.Medical_Keyword_4 * coeffDoc.cf_Medical_Keyword_4 +
				custDoc.Medical_Keyword_5 * coeffDoc.cf_Medical_Keyword_5 +
				custDoc.Medical_Keyword_6 * coeffDoc.cf_Medical_Keyword_6 +
				custDoc.Medical_Keyword_7 * coeffDoc.cf_Medical_Keyword_7 +
				custDoc.Medical_Keyword_8 * coeffDoc.cf_Medical_Keyword_8 +
				custDoc.Medical_Keyword_9 * coeffDoc.cf_Medical_Keyword_9 +
				custDoc.Medical_Keyword_10 * coeffDoc.cf_Medical_Keyword_10 +
				custDoc.Medical_Keyword_11 * coeffDoc.cf_Medical_Keyword_11 +
				custDoc.Medical_Keyword_12 * coeffDoc.cf_Medical_Keyword_12 +
				custDoc.Medical_Keyword_13 * coeffDoc.cf_Medical_Keyword_13 +
				custDoc.Medical_Keyword_14 * coeffDoc.cf_Medical_Keyword_14 +
				custDoc.Medical_Keyword_15 * coeffDoc.cf_Medical_Keyword_15 +
				custDoc.Medical_Keyword_16 * coeffDoc.cf_Medical_Keyword_16 +
				custDoc.Medical_Keyword_17 * coeffDoc.cf_Medical_Keyword_17 +
				custDoc.Medical_Keyword_18 * coeffDoc.cf_Medical_Keyword_18 +
				custDoc.Medical_Keyword_19 * coeffDoc.cf_Medical_Keyword_19 +
				custDoc.Medical_Keyword_20 * coeffDoc.cf_Medical_Keyword_20 +
				custDoc.Medical_Keyword_21 * coeffDoc.cf_Medical_Keyword_21 +
				custDoc.Medical_Keyword_22 * coeffDoc.cf_Medical_Keyword_22 +
				custDoc.Medical_Keyword_23 * coeffDoc.cf_Medical_Keyword_23 +
				custDoc.Medical_Keyword_24 * coeffDoc.cf_Medical_Keyword_24 +
				custDoc.Medical_Keyword_25 * coeffDoc.cf_Medical_Keyword_25 +
				custDoc.Medical_Keyword_26 * coeffDoc.cf_Medical_Keyword_26 +
				custDoc.Medical_Keyword_27 * coeffDoc.cf_Medical_Keyword_27 +
				custDoc.Medical_Keyword_28 * coeffDoc.cf_Medical_Keyword_28 +
				custDoc.Medical_Keyword_29 * coeffDoc.cf_Medical_Keyword_29 +
				custDoc.Medical_Keyword_30 * coeffDoc.cf_Medical_Keyword_30 +
				custDoc.Medical_Keyword_31 * coeffDoc.cf_Medical_Keyword_31 +
				custDoc.Medical_Keyword_32 * coeffDoc.cf_Medical_Keyword_32 +
				custDoc.Medical_Keyword_33 * coeffDoc.cf_Medical_Keyword_33 +
				custDoc.Medical_Keyword_34 * coeffDoc.cf_Medical_Keyword_34 +
				custDoc.Medical_Keyword_35 * coeffDoc.cf_Medical_Keyword_35 +
				custDoc.Medical_Keyword_36 * coeffDoc.cf_Medical_Keyword_36 +
				custDoc.Medical_Keyword_37 * coeffDoc.cf_Medical_Keyword_37 +
				custDoc.Medical_Keyword_38 * coeffDoc.cf_Medical_Keyword_38 +
				custDoc.Medical_Keyword_39 * coeffDoc.cf_Medical_Keyword_39 +
				custDoc.Medical_Keyword_40 * coeffDoc.cf_Medical_Keyword_40 +
				custDoc.Medical_Keyword_41 * coeffDoc.cf_Medical_Keyword_41 +
				custDoc.Medical_Keyword_42 * coeffDoc.cf_Medical_Keyword_42 +
				custDoc.Medical_Keyword_43 * coeffDoc.cf_Medical_Keyword_43 +
				custDoc.Medical_Keyword_44 * coeffDoc.cf_Medical_Keyword_44 +
				custDoc.Medical_Keyword_45 * coeffDoc.cf_Medical_Keyword_45 +
				custDoc.Medical_Keyword_46 * coeffDoc.cf_Medical_Keyword_46 +
				custDoc.Medical_Keyword_47 * coeffDoc.cf_Medical_Keyword_47 +
				custDoc.Medical_Keyword_48 * coeffDoc.cf_Medical_Keyword_48;
		
		return riskScore;
	}
}
