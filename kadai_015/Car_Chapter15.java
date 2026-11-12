package kadai_015;

public class Car_Chapter15 {

	private int gear = 1;
	private int speed = 10;

    public void changeGear(int afterGear) {
	     this.gear = afterGear;
	     
	     if (this.gear >= 1 && this.gear <= 5) {
	    	 this.speed = this.gear * 10;
	     } else {
	    	 this.speed = 10;
	     }
    }
    
    public void run() {
		System.out.println("ギア" + 1 + "から" + this.gear + "に切り替えました");
    	System.out.println("速度は時速" + this.speed + "kmです");
    }
	
}
