import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.io.File;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class NotePadDemo extends JFrame {
	JTextArea textArea = new JTextArea();
	JScrollPane scrollPane = new JScrollPane();
	private JPanel contentPane;
	
	private void saveFile(){
		String currentDirPath = "/Users/amit/Documents";
		JFileChooser saveDialog = new JFileChooser(currentDirPath);
		saveDialog.showSaveDialog(this);
		File file = saveDialog.getSelectedFile();
		String path = file.getPath();
		try {
			FileOperationsDemo.writeFile(path,textArea.getText());
			this.setTitle(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			textArea.setText(e.toString());
			//e.printStackTrace();
		}
	}
	private void openFile(){
		String currentDirPath = "/Users/amit/Documents";
		JFileChooser openDialog = new JFileChooser(currentDirPath);
		openDialog.showOpenDialog(this);
		File file = openDialog.getSelectedFile();
		String path = file.getPath();
		try {
			textArea.setText(FileOperationsDemo.readFile(path));
		} catch (IOException e) {
			textArea.setText(e.toString());
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		//System.out.println(file.getPath());
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NotePadDemo frame = new NotePadDemo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private void resizeTextArea(){
		scrollPane.setSize(this.getWidth()-20,this.getHeight()-50);
		textArea.setSize(this.getWidth()-20,this.getHeight()-50);
	}

	/**
	 * Create the frame.
	 */
	public NotePadDemo() {
		this.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
				resizeTextArea();
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		scrollPane.setBounds(6, 26, 426, 266);
		contentPane.add(scrollPane);
		
		
		textArea.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		textArea.setBounds(6, 26, 400, 241);
		scrollPane.setViewportView(textArea);
		
		JMenuBar menuBar = new JMenuBar();
		this.setJMenuBar(menuBar);
		
		JMenu file = new JMenu("File");
		menuBar.add(file);
		JMenuItem newItem = new JMenuItem("New");
		file.add(newItem);
		JMenuItem open = new JMenuItem("Open");
		file.add(open);
		open.addActionListener((e)->{
			openFile();
		});
		JMenuItem save = new JMenuItem("Save");
		file.add(save);
		save.addActionListener((e)->{
			saveFile();
		});
		
		//menuBar.setBounds(6, -8, 132, 22);
		//contentPane.add(menuBar);
		//contentPane.add(textArea);
	}
}
