package arithmeticCalcuator;

//A POJO class for Data Input
public class InputData {

		//Date input of private type
		private double number1=0.0;
		private double number2=0.0;
		private double totalSum=0.0;
		private double totalDifference=0.0;
		private double totalProduct=0.0;
		private double totalQuotient=0.0;
		
		//parameterized constructor with all values initialized
		public InputData(double number1, double number2) {
			this.number1=number1;
			this.number2=number2;
		}
		
		//getter method to obtain the number1
		public double getNumber1() {
			return number1;
		}
		//setter method to set number1
		public void setNumber1(double number1) {
			this.number1 = number1;
		}
		//getter method to obtain the number2
		public double getNumber2() {
			return number2;
		}
		
		//setter method to set number2
		public void setNumber2(double number2) {
			this.number2 = number2;
		}
		public double getTotalSum() {
			return totalSum;
		}
		public void setTotalSum(double totalSum) {
			this.totalSum = totalSum;
		}
		public double getTotalDifference() {
			return totalDifference;
		}
		public void setTotalDifference(double totalDifference) {
			this.totalDifference = totalDifference;
		}
		public double getTotalProduct() {
			return totalProduct;
		}
		public void setTotalProduct(double totalProduct) {
			this.totalProduct = totalProduct;
		}
		public double getTotalQuotient() {
			return totalQuotient;
		}
		public void setTotalQuotient(double totalQuotient) {
			this.totalQuotient = totalQuotient;
		}
		
}
