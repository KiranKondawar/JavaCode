package normal;

public class customer {

	
	int id;
	String Name;
	String Add;

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAdd() {
		return Add;
	}
	public void setAdd(String add) {
		Add = add;
	}
	public customer(int id, String name, String add) {
		super();
		this.id = id;
		Name = name;
		Add = add;
	}
	@Override
	public String toString() {
		return "customer [id=" + id + ", Name=" + Name + ", Add=" + Add + "]";
	}
}
