/*
 * What to Do
 * Interface is 100% Abstract
 */
interface ISuperPower{
	void bonusPoints();
}
// abstract interface IPlayer
interface IPlayer{
	int MAX_SPEED = 100; // public static int final MAX_SPEED = 100;
	int MIN_SPEED = 1;
	int AVERAGE_SPEED = 50;
	int DEFAULT_SPEED = 10;
	int FULL_JUMP =90;
	int AVERAGE_JUMP = 50;
	void jump(); //public abstract void jump();
	int run(); // public abstract int run();
}
class BlackPlayerImpl implements IPlayer,ISuperPower{

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int run() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void bonusPoints() {
		// TODO Auto-generated method stub
		
	}
	
}
// How to do
class WhitePlayerImpl implements IPlayer{
	int jumpStart;
	int runStart;
	WhitePlayerImpl(int jumpStart, int runStart){
		this.jumpStart = jumpStart;
		this.runStart = runStart;
	}
	@Override
	public void jump(){
		if(jumpStart<FULL_JUMP){
			jumpStart++;
		}
	}
	@Override
	public int run(){
		if(runStart<AVERAGE_SPEED){
			runStart++;
		}
		return runStart;
	}
}
public class InterfaceUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WhitePlayerImpl w = new WhitePlayerImpl(10, 2);
		w.jump();
		w.run();

	}

}
