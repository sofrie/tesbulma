package hello;

public class Process {
	private String proccessId;
	private String requestId;
	public String getProccessId() {
		return proccessId;
	}
	public void setProccessId(String proccessId) {
		this.proccessId = proccessId;
	}
	public String getRequestId() {
		return requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((proccessId == null) ? 0 : proccessId.hashCode());
		result = prime * result + ((requestId == null) ? 0 : requestId.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Process other = (Process) obj;
		if (proccessId == null) {
			if (other.proccessId != null)
				return false;
		} else if (!proccessId.equals(other.proccessId))
			return false;
		if (requestId == null) {
			if (other.requestId != null)
				return false;
		} else if (!requestId.equals(other.requestId))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return String.format("Process [proccessId=%s, requestId=%s]", proccessId, requestId);
	}
	
}
