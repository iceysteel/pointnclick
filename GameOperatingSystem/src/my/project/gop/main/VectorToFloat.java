package my.project.gop.main;

public class VectorToFloat {

	public float xpos;
	public float ypos;
	
	public static float worldXpos;
	public static float worldYpos;
	
	public VectorToFloat() {
		this.xpos = 0.0f;
		this.ypos = 0.0f;
	}

	public VectorToFloat(float xpos, float ypos) {
		this.xpos = xpos;
		this.ypos = ypos;
	}
	
	public static VectorToFloat zero() {
		return new VectorToFloat(0, 0);
	}
	
	public void normalize(){
		double length = Math.sqrt(xpos * xpos + ypos * ypos);
		
		if(length!= 0.0){
			float s = 1.0f / (float) length;
			xpos = xpos * s;
			ypos = ypos * s;
		}
	}
	
	public boolean equals(VectorToFloat vec){
		return (this.xpos == vec.xpos && this.xpos == vec.xpos);
	}
	
	public VectorToFloat copy(VectorToFloat vec){
		xpos = vec.xpos;
		ypos = vec.ypos;
		return new VectorToFloat(xpos, ypos); 
	}
	
	public VectorToFloat add(VectorToFloat vec){
		xpos = xpos + vec.xpos;
		ypos = ypos + vec.ypos;
		return new VectorToFloat(xpos, ypos);
	}
	
	//set and get
	public static void setWorldVaribles(float worldx, float worldy){
		worldXpos = worldx;
		worldYpos = worldy;
	}
	
	public VectorToFloat getWorldLocation(){
		return new VectorToFloat(xpos - worldXpos, ypos - worldYpos);
	}
	
	public VectorToFloat getScreenLocation(){
		return new VectorToFloat(xpos, ypos);
	}
	
	//end set and get
	
	public static double getDistanceOnScreen(VectorToFloat vec1, VectorToFloat vec2){
		float v1 = vec1.xpos - vec2.xpos;
		float v2 = vec1.ypos - vec2.ypos;
		return Math.sqrt(v1*v1 + v2*v2);
	}
//	public static double distance(VectorToFloat vec1, VectorToFloat vec2){
//		float dist = (float)(Math.sqrt((vec2.xpos - vec1.xpos)*(vec2.xpos - vec1.xpos) +  (vec2.ypos - vec1.ypos)*(vec2.ypos - vec1.ypos)) );
//		return dist;
//	}
	
	public double getDistanceBetweenWorldVectors(VectorToFloat vec){
		float dx = Math.abs(getWorldLocation().xpos -  vec.getWorldLocation().xpos);
		float dy = Math.abs(getWorldLocation().ypos -  vec.getWorldLocation().ypos);
		return Math.abs(dx * dx - dy * dy);
	}

}
