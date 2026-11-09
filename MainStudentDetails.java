class MainStudentDetails{
	public static void main(String args[]){
		StudentDetails Stu1;
		Stu1 = new StudentDetails();
		Stu1.setStudentDetails(1001,"Pirana",85,90,95);
		Stu1.calTotal();
		Stu1.calAverage();
		Stu1.getStudentDetails(Stu1.avg);
		Stu1.display();
	}
}