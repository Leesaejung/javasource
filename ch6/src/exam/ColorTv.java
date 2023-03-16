package exam;

class ColorTv extends Tv {
	   private int resolution;
	   ColorTv(int size, int resolution) {
	      super(size);
	      this.resolution = resolution;
	   }
	   public void printProperty() {
	      System.out.print(getSize()+"인치 "+resolution+"컬러");
	   }
	   
	//get으로 가져오기   
	public int getResolution() {
		return resolution;
	}
	   
	   
}