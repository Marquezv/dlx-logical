package objects;

import java.util.Objects;

public class Sales {
	private final String id;
	private final Product product;
	private final User user;
	private final double total;
	
	public Sales(final String id, final Product product, final User user,final double total) {
		this.id = id;
		this.product = product;
		this.user = user;
		this.total = total;
	}
	
	
	public String getId() {
		return id;
	}


	public Product getProduct() {
		return product;
	}


	public User getUser() {
		return user;
	}


	public double getTotal() {
		return total;
	}


	@Override
	public String toString() {
		return "User{" +
				" id= " + id +
				" product=[ " + product +
				"] user=[ " + user +
				"] total= " + total + '\'' +
				" }";
	}
		
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null || getClass() != o.getClass()) return false;
		Sales that = (Sales) o;
		return id.equals(that.id) &&
				product.equals(that.product) &&
				user.equals(that.user) &&
				Double.compare(that.total, total) == 0;

	}

	
	@Override
	public int hashCode() {
		return Objects.hash(id, product, user, total);
	}
}
