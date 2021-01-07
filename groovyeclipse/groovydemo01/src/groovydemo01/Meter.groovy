package groovydemo01

class Meter {
	int meter;
	double cm;
	
	Meter(double meter){
		 this.meter=(int)meter;
		 this.cm=(meter-this.meter)*100
	}
	
	
}
