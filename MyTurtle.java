public class MyTurtle extends BaseTurtle {

	public void draw() {
                
		//pen.setColor(3, 0.2, 1); // violeta
		pen.setColor(0.5, 0.5, 1); // azul
                pen.setStrokeWidth(8);
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
		//this.forward(1);
		moveTo(3,0);
                this.turn(-90);
		this.back(2);

		//move a caneta
		pen.up();
		moveTo(6,0);
		pen.down();

               //desenha um C
                moveTo(4,0);
		moveTo(4,2);
		//this.forward(2);
		moveTo(6,2);
                   
		//move a caneta
                 pen.up();
		 moveTo(9,0);
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
		 moveTo(1,-4);
                 pen.down();

              //faz a lateral do cubo
		 pen.setColor(0, 0.1, 0.3); //
		 pen.setStrokeWidth(65);
		 moveTo(3, -2);
		 moveTo(3, -6);
		 moveTo(1,-8);
		 moveTo(1, -4);

		 
                //move a caneta
                 pen.up();
		 moveTo(-3,-4);
                 pen.down();
		

		 //faz a parte de cima do cubo
                pen.setColor(0.1, 0.2, 0.5);
		 pen.setStrokeWidth(65);
		 moveTo(-1,-2);
		 moveTo(3, -2);
		 moveTo(1, -4);
		 moveTo(-3,-4);

		//move a caneta
                 pen.up();
		 moveTo(1,-8);
                 pen.down();
		
		//faz a frente do cubo
		pen.setColor(0.2, 0.2, 0.7);
                pen.setStrokeWidth(75);
		moveTo(-3,-8);
		moveTo(-3,-5);
		moveTo(1,-5);
		moveTo(1,-8);

                //move a caneta
                 pen.up();
		 moveTo(-1,-8);
                 pen.down();
		this.square(2);
               
		//move a caneta
		pen.up();
		moveTo(-1,-7);
		pen.down();
		
	}
	
	//Obs: essa funcao foi reutizada do exemplo da tartaruga disponibilizado
	private void square(double size) {
		for (int i = 0; i < 4; i++) {
			this.forward(size);
			this.turn(90);
		}
	}

}
