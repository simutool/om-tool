package simutool.models;

public class Simulation {
	private String name;
	private int id;
	private int panelNum;
	
	
	public Simulation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Simulation(int id, String name, int panelNum) {
		super();
		this.name = name;
		this.id = id;
		this.panelNum = panelNum;
	}
	public Simulation(String name, int panelNum) {
		super();
		this.name = name;
		this.panelNum = panelNum;
	}
	public Simulation(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPanelNum() {
		return panelNum;
	}
	public void setPanelNum(int panelNum) {
		this.panelNum = panelNum;
	}
	
	
	
}