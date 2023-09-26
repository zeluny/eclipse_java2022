
public class BMI {
	public static void main(String[] args) {
	double height = 160;
	double weight = 50;
	double bmi = 0;
	double process = 0.01;
	
	bmi = (weight/((height * process)*(height * process)));
	System.out.println("BPM ="+bmi);
	if(bmi < 18.5 ) {
		System.out.println("น้ำหนักน้อย / ผอม");
	}else if(bmi >= 18.5 && bmi <= 22.90 ){
		System.out.println("ปกติ (สุขภาพดี)");
	}else if(bmi >= 23 && bmi <= 24.90 ){
		System.out.println("ท้วม / โรคอ้วนระดับ 1");
	}else if(bmi >= 25 && bmi <= 29.90 ){
		System.out.println("อ้วน / โรคอ้วนระดับ 2");
	}else if(bmi > 30){
		System.out.println("อ้วนมาก / โรคอ้วนระดับ 3");
	}
	}
}
