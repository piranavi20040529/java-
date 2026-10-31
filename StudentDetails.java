class StudentDetails{
	int id;
	String name;
	int m1;
	int m2;
	int m3;
	int total;
	double avg;
	String result;
	
	void setStudentDetails(int id,String name,int m1,int m2,int m3){
		this.id = id;
		this.name = name;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}
	
	int calTotal(){
		total = m1 + m2 + m3;
		return total;
	}
	
	double calAverage(){
		avg = total / 3;
		return avg;
	}
	
	String getStudentDetails(double avg){
		this.avg = avg;
		
		if(avg >= 75){
			result = "A";
		}else if(avg >= 65){
			result = "B";
		}else if(avg >= 55){
			result = "C";
		}else if(avg >= 45){
			result = "D";
		}else {
			result = "F";
		}
		return result;
	}
	
	void display(){
		System.out.println("Id : " + this.id);
		System.out.println("Name : " + this.name);
		System.out.println("M1 : " + this.m1);
		System.out.println("M2 : " + this.m2);
		System.out.println("M3 : " + this.m3);
		System.out.println("Total : " + this.total);
		System.out.println("Average : " + this.avg);
		System.out.println("Result : " + this.result);
	}
}
