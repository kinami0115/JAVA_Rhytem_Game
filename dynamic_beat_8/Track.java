package dynamic_beat_8;

public class Track {
	
	private String titleImage; //���� �κ� �̹���
	private String stratImage; // ���� ���� â ǥ�� �̹���
	private String gameImage; // �ش� ���� ���� ���� �� ǥ��
	private String startMusic; // ���� ���� â ����
	private String gameMusic; // �ش� ���� ���� ���� �� ����
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
	public Track(String titleImage, String stratImage, String gameImage, String startMusic, String gameMusic) {
		super();
		this.titleImage = titleImage;
		this.stratImage = stratImage;
		this.gameImage = gameImage;
		this.startMusic = startMusic;
		this.gameMusic = gameMusic;
	}
	
	
}
