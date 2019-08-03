package dynamic_beat_13;

public class Track {
	
	private String titleImage; //제목 부분 이미지
	private String stratImage; // 게임 선택 창 표지 이미지
	private String gameImage; // 해당 곡을 실행 했을 때 표지
	private String startMusic; // 게임 선택 창 음악
	private String gameMusic; // 해당 곡을 실행 했을 때 음악
	private String titleName; // 곡 제목
	
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
