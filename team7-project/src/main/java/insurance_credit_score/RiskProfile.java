package insurance_credit_score;

import org.bson.Document;

public class RiskProfile {
	double riskScore;
	Document document;
	Coefficient coeff;
	double ageScore;
	String riskGrade;



	public String getRiskGrade() {
		return riskGrade;
	}

	public void setRiskGrade(String riskGrade) {
		this.riskGrade = riskGrade;
	}

	public RiskProfile(Document document, Coefficient coeff) {
		super();
		this.document = document;
		this.coeff = coeff;
		
	}

	public double getRiskScore() {
		return riskScore;
	}
	public void setRiskScore(double riskScore) {
		this.riskScore = riskScore;
	}
	public Document getDocument() {
		return document;
	}
	public void setDocument(Document document) {
		this.document = document;
	}

	public void calculateRiskScore() {
		
		Customer cust = new Customer(document);
		cust.calculateCustomerMetrics();	
			
		ScoreCalculator sc;	
		
		
		sc = new ScoreCalculator();
		double riskScore = sc.CalculateScore(cust, coeff);
		
		
		System.out.println("Risk Score is : "+(riskScore));
		this.setRiskScore(riskScore);
		
		calculateRiskGrade();
				
	}
	
	

	private void calculateRiskGrade() {
		
		if(riskScore >= 12.0) {
			this.riskGrade = "E";
		}else if(riskScore >= 8.5 && riskScore <12) {
			this.riskGrade = "D";
		}else if(riskScore >=7.0 && riskScore < 8.5) {
			this.riskGrade = "C";
		}else if(riskScore >=5.0 && riskScore < 7.0) {
			this.riskGrade = "B";
		}else {
			this.riskGrade = "A";
		}
	}
	
	public void displayRiskDefinition() {
		System.out.println("-----------------------------------------------");
		System.out.println(" Risk Level = A means  Very Low Risk");
		System.out.println(" Risk Level = B means       Low Risk");
		System.out.println(" Risk Level = C means Moderate  Risk");
		System.out.println(" Risk Level = D means      High Risk");
		System.out.println(" Risk Level = E means Very High Risk");
		System.out.println("-----------------------------------------------");
	}




}
