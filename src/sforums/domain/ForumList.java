package sforums.domain;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "forums")
public class ForumList extends IdentifiableEntityList<Forum> {

	public ForumList() {
	}

	public ForumList(List<Forum> forums) {
		super(forums);
	}

	@XmlElement(name = "forum")
	@Override
	public List<Forum> getList() {
		return super.getList();
	}
}
