//DO NOT EDIT THIS CLASS: Reference this code to make edits to your other animals
import processing.core.PApplet;
public class Mammal {

	private int age, speed;
	private float xPosition, yPosition;
	private String name, img;
	private final double GRAVITY = 5;
	private float GROUND_LEVEL;
	private float yVelocity;
	
	public Mammal(String name, int age, float xPosition, float yPosition, String img) {
		this.name = name;
		this.age = age;
		this.xPosition = xPosition;
		this.yPosition = yPosition;
		this.img = img;
		this.speed = 10;
		this.GROUND_LEVEL = yPosition;
		this.yVelocity = 0;
	}
//**************************************************************	
	//Actions
	public void jump(int jumpVelocity) {
		yVelocity += jumpVelocity;
	}
	
	public void gravity() {
		if(yPosition < GROUND_LEVEL) {
			yVelocity -= GRAVITY;
		}
		else if(yPosition > GROUND_LEVEL) {
			yVelocity = 0;
			yPosition = GROUND_LEVEL;
		}
	}
	
	public void moveY() {
		yPosition -= yVelocity;
		gravity();
	}
	
	public void move(String direction, int speed) {
		direction = direction.toLowerCase(); 
		if(direction.contentEquals("right")) {
				this.xPosition += speed;
		}
		else if(direction.contentEquals("left")) {
				this.xPosition -= speed;
		}
		else {
			System.out.println("ERROR: Direction not compatible with code. Change value");
		}
	}
	
	public void draw(PApplet p) {
		p.image(p.loadImage(img), xPosition, yPosition);
	}
	
//**************************************************************	
	//Get Methods
	public int getAge() {
		return age;
	}
	public int getSpeed() {
		return speed;
	}
	public float getX() {
		return xPosition;
	}
	public float getY() {
		return yPosition;
	}
	public String getName() {
		return name;
	}
	public String getImage() {
		return img;
	}
	public float getYVelocity() {
		return yVelocity;
	}
	
//**************************************************************	
	//Set Methods
	public void setX(float x) {
		xPosition = x;
	}
	public void setY(float y) {
		yPosition = y;
	}
	
//**************************************************************
	//Other
	public boolean isOnGround() {
		if (yPosition == GROUND_LEVEL)
			return true;
		return false;
	}
	
	public void ageUp() {
		age++;
	}
	
	public boolean clicked(float mouseX, float mouseY) {
		if(mouseY >= yPosition && mouseY <= yPosition + 100 && mouseX >= xPosition && mouseX <= xPosition+50){
			return true;
		}
		return false;
	}
	
}
