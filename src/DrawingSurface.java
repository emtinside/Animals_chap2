import java.awt.event.KeyEvent;
import processing.core.PApplet;

public class DrawingSurface extends PApplet{

	Mammal mammal;
	Cat cat;
	Human human;
	
	//Uncomment lines in this constructor to add your animals to the screen
	
	/** Creates a DrawingSurface **/
	public DrawingSurface() {
		mammal = new Mammal("Unknown", 1000, 100, 50, "mammal.png");
		cat = new Cat("Fluffy", 5, 100, 100, "Domestic_Cat.png");
		human = new Human("Susan", 49, 100, 200, "woman.png");
	}
	
	public void setup() {
		frameRate(30);
	}
	
	public void draw() {
		this.background(255);
		
		//Mammal Movement
		mammal.moveY();
		mammal.draw(this);
		
		//Cat Movement
		cat.moveY();
		cat.draw(this);
		
		//Human Movement
		human.moveY();
		human.draw(this);
	}
	
	public void keyPressed() {
		if(keyCode == KeyEvent.VK_RIGHT) {
			mammal.move("right", mammal.getSpeed());
			cat.move("right", cat.getSpeed());
			human.move("right", human.getSpeed());
		}
		else if(keyCode == KeyEvent.VK_LEFT) {
			mammal.move("left", mammal.getSpeed());
			cat.move("left", cat.getSpeed());
			human.move("left", human.getSpeed());
		}
		else if (keyCode == KeyEvent.VK_SPACE) {
			mammal.jump(20);
//			cat.jump();
//			human.jump();
		}
	}
	
	public void mousePressed() {
		if(mammal.clicked(this.mouseX, this.mouseY)) {
			System.out.println("Aha!");
		}
		else if(cat.clicked(this.mouseX, this.mouseY)) {
			//Write code here
		}
		else if(human.clicked(this.mouseX, this.mouseY)){
			//Write code here
		}
	}
	
}

