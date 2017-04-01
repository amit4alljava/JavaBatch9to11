class BackupJob implements Runnable
{
	@Override
	public void run(){
		// this contains backup logic
		for(int i = 1; i<=5; i++){
			System.out.println("BACK UP is Going On...");
		}
	}
}
class UploadDataToServerJob implements Runnable
{
	public void run(){
		// this contains Upload Logic
		for(int i = 1; i<=5; i++){
			System.out.println("Upload  is Going On...");
		}
		
	}
}
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BackupJob backupJob = new BackupJob();
		Thread worker = new Thread(backupJob,"BACKUP");
		BackupJob backupJob2 = new BackupJob();
		Thread worker3 = new Thread(backupJob2,"BACKUP2");
		UploadDataToServerJob upload = new UploadDataToServerJob();
		Thread worker2 = new Thread(upload,"UPLOAD");
		worker.start();
		worker2.start();
		worker3.start();
		
		
	}

}





