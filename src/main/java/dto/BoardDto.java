package dto;

import java.sql.Date;

public class BoardDto {
	private int bno;
	private String title;
	private String content;
	private String writer;
	private Date regDate;
	private Date updateDate;
	private String pic;
	
	public BoardDto() {}
	
	public BoardDto(int bno, String title, String content, String writer, Date regDate, Date updateDate, String pic) {
		super();
		this.bno = bno;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.regDate = regDate;
		this.updateDate = updateDate;
		this.pic = pic;
	}
	
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	
	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BoardDto [bno=").append(bno).append(", title=").append(title).append(", content=")
				.append(content).append(", writer=").append(writer).append(", regDate=").append(regDate)
				.append(", updateDate=").append(updateDate).append(", pic=").append(pic).append("]");
		return builder.toString();
	}
	
	
}
