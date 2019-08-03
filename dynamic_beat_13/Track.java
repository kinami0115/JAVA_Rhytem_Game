package dynamic_beat_13;

public class Track {
	
	private String titleImage; //���� �κ� �̹���
	private String stratImage; // ���� ���� â ǥ�� �̹���
	private String gameImage; // �ش� ���� ���� ���� �� ǥ��
	private String startMusic; // ���� ���� â ����
	private String gameMusic; // �ش� ���� ���� ���� �� ����
	private String titleName; // �� ����
	
	public String getTitleImage() {
		return titleImage;
	}
	public void setTitleImage(String titleImage) {
		this.titleImage = titleImage;
	}
	public String getStratImage() {
		return stratImage;
	}
	public void setStratImage(String stratImage) {
		this.stratImage = stratImage;
	}
	public String getGameImage() {
		return gameImage;
	}
	public void setGameImage(String gameImage) {
		this.gameImage = gameImage;
	}
	public String getStartMusic() {
		return startMusic;
	}
	public void setStartMusic(String startMusic) {
		this.startMusic = startMusic;
	}
	public String getGameMusic() {
		return gameMusic;
	}
	public void setGameMusic(String gameMusic) {
		this.gameMusic = gameMusic;
	}
	public String getTitleName() {
		return titleName;
	}
	public void setTitleName(String titleName) {
		this.titleName = titleName;
	}
	public Track(String titleImage, String stratImage, String gameImage, String startMusic, String gameMusic, String titleName) {
		super();
		this.titleImage = titleImage;
		this.stratImage = stratImage;
		this.gameImage = gameImage;
		this.startMusic = startMusic;
		this.gameMusic = gameMusic;
		this.titleName = titleName;
	}
	
	
}
