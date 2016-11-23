package cn.cerc.jpage.vcl;

import cn.cerc.jpage.core.Component;
import cn.cerc.jpage.core.HtmlWriter;

/**
 * 多行文本输入框
 * 
 * @author 黄荣君
 *
 */
public class TextArea extends Component {
	private Label caption;
	private String name;
	private String text;
	private int cols;
	private int rows;
	private boolean readonly;

	public TextArea() {
	}

	public TextArea(Component owner) {
		super(owner);
	}

	@Override
	public void output(HtmlWriter html) {
		if (caption != null) {
			caption.output(html);
		}

		html.print("<textarea ");
		if (name != null) {
			html.print("name='%s' ", name);
		}
		if (cols != 0) {
			html.print("rows='%s' ", cols);
		}
		if (rows != 0) {
			html.print("rows='%s' ", rows);
		}
		if (readonly) {
			html.print("readonly='readonly'");
		}
		html.print(">");

		if (text != null) {
			html.print(text);
		}
		html.print("</textarea>");
	}

	public Label getCaption() {
		if (caption == null)
			caption = new Label();
		return caption;
	}

	public void setCaption(Label caption) {
		this.caption = caption;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getCols() {
		return cols;
	}

	public void setCols(int cols) {
		this.cols = cols;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public boolean isReadonly() {
		return readonly;
	}

	public void setReadonly(boolean readonly) {
		this.readonly = readonly;
	}

}