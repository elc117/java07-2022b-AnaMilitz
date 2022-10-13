public class MyTurtle extends BaseTurtle {

	public void draw() {

		//desenha um S
		pen.up();
	        moveTo(-9,0);
	        pen.down();
	  	this.forward(2);
		this.turn(90);
		this.forward(1);
		this.turn(-90);
		this.back(2);
		this.turn(90);
		this.forward(1);
		this.turn(-90);
		this.forward(2);
		
		//move a caneta
		pen.up();
		moveTo(-4,0);
		pen.down();
		
		
		//desenha um C
		this.back(2);
		this.turn(90);
		this.forward(2);
		this.turn(-90);
		this.forward(2);
		
		//move a caneta
		pen.up();
		moveTo(-3,0);
		pen.down();
		
		//desenha um I
		this.turn(-90);
		this.back(2);
		
	        //move a caneta
		pen.up();
		moveTo(0,0);
		pen.down();
		
		//desenha um E
		this.turn(90);
		this.back(2);
		this.turn(90);
		this.forward(2);
		this.back(1);
		this.turn(-90);
		this.forward(2);
		this.back(2);
		this.turn(90);
		this.forward(1);
		this.turn(-90);
		this.forward(2);
		
		//move a caneta
		pen.up();
		moveTo(1,0);
		pen.down();
		
		//desenha um N
		this.turn(-90);
		this.back(2);
		this.turn(90);
		moveTo(0,1);
		
	}

}
