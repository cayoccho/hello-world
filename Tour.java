package edu.ctu.thesis.travelsystem.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "TOUR")
public class Tour {
	private int idTour;
	private String name;
	private Date departureDate;
	private String departureTime;
	private Date returnDate;
	private String returnTime;
	private String price;
	private int quantum;
	private String detail;
	private String image;
	private Integer ticketAvailability;
	private Date dateAllowReg;
	private Date dateAllowCancel;
	private boolean fullOrNot;
	private boolean regOrNot = true;
	private boolean cancelOrNot = true;
	private RegistrationInfo regInfo;
	/*private boolean fieldName = true;
	private boolean fieldSex = true;
	private boolean fieldEmail = true;
	private boolean fieldPhone = true;
	private boolean fieldAddress = true;
	private boolean fieldIdCard = true;
	private boolean fieldNoOfTicket = true;

	public Tour() {
	}

	public Tour(String name, Date departureDate, String departureTime, Date returnDate, String returnTime, String price,
			int quantum, String detail, String image, int ticketAvailability, Date dateAllowReg, Date dateAllowCancel,
			boolean fullOrNot, boolean regOrNot, boolean cancelOrNot, boolean fieldName, boolean fieldSex, boolean fieldEmail, boolean fieldPhone,
			boolean fieldAddress, boolean fieldIdCard, boolean fieldNoOfTicket) {
		this.name = name;
		this.departureDate = departureDate;
		this.departureTime = departureTime;
		this.returnDate = returnDate;
		this.returnTime = returnTime;
		this.price = price;
		this.quantum = quantum;
		this.detail = detail;
		this.image = image;
		this.ticketAvailability = ticketAvailability;
		this.dateAllowReg = dateAllowReg;
		this.dateAllowCancel = dateAllowCancel;
		this.fullOrNot = fullOrNot;
		this.regOrNot = regOrNot;
		this.cancelOrNot = cancelOrNot;
		this.fieldName = fieldName;
		this.fieldSex = fieldSex;
		this.fieldEmail = fieldEmail;
		this.fieldPhone = fieldPhone;
		this.fieldAddress = fieldAddress;
		this.fieldIdCard = fieldIdCard;
		this.fieldNoOfTicket = fieldNoOfTicket;
	}*/

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID_TOUR", nullable = false)
	public int getIdTour() {
		return idTour;
	}

	public void setIdTour(int idTour) {
		this.idTour = idTour;
	}

	// Create column Tour name
	@Column(name = "NAME", nullable = false, length = 50)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// Create column Departure date
	@Column(name = "DEPARTURE_DATE", nullable = false)
	@Temporal(TemporalType.DATE)
	public Date getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}

	// Create column Departure time
	@Column(name = "DEPARTURE_TIME", nullable = false, length = 10)
	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	// Create column Return date
	@Column(name = "RETURN_DATE", nullable = false)
	@Temporal(TemporalType.DATE)
	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	// Create column Return time
	@Column(name = "RETURN_TIME", nullable = false, length = 10)
	public String getReturnTime() {
		return returnTime;
	}

	public void setReturnTime(String returnTime) {
		this.returnTime = returnTime;
	}

	// Create column Price
	@Column(name = "PRICE", nullable = false)
	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	// Create column Quantum
	@Column(name = "QUANTUM", nullable = false)
	public int getQuantum() {
		return quantum;
	}

	public void setQuantum(int quantum) {
		this.quantum = quantum;
	}

	// Create column Tour detail
	@Column(name = "DETAIL", nullable = false, length = 2000)
	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	@Column(name = "IMAGE", nullable = true, length = 200)
	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	// Create column Number ticket availability
	@Column(name = "TICKET_AVAILABILITY", nullable = false)
	public Integer getTicketAvailability() {
		return ticketAvailability;
	}

	public void setTicketAvailability(Integer ticketAvailability) {
		this.ticketAvailability = ticketAvailability;
	}

	// Create column Date allow register
	@Column(name = "DATE_ALLOW_REG", nullable = false)
	@Temporal(TemporalType.DATE)
	public Date getDateAllowReg() {
		return dateAllowReg;
	}

	public void setDateAllowReg(Date dateAllowReg) {
		this.dateAllowReg = dateAllowReg;
	}

	// Create column Date allow cancel
	@Column(name = "DATE_ALLOW_CANCEL", nullable = false)
	@Temporal(TemporalType.DATE)
	public Date getDateAllowCancel() {
		return dateAllowCancel;
	}

	public void setDateAllowCancel(Date dateAllowCancel) {
		this.dateAllowCancel = dateAllowCancel;
	}

	@Column(name = "FULL_OR_NOT", nullable = false)
	public boolean getFullOrNot() {
		return fullOrNot;
	}

	public void setFullOrNot(boolean fullOrNot) {
		this.fullOrNot = fullOrNot;
	}

	@Column(name = "REG_OR_NOT", nullable = false)
	public boolean getRegOrNot() {
		return regOrNot;
	}

	public void setRegOrNot(boolean regOrNot) {
		this.regOrNot = regOrNot;
	}

	@Column(name = "CANCEL_OR_NOT", nullable = false)
	public boolean getCancelOrNot() {
		return cancelOrNot;
	}

	public void setCancelOrNot(boolean cancelOrNot) {
		this.cancelOrNot = cancelOrNot;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "tour", cascade = CascadeType.ALL)
	public RegistrationInfo getRegInfo() {
		return regInfo;
	}

	public void setRegInfo(RegistrationInfo regInfo) {
		this.regInfo = regInfo;
	}
	
	@Override
	public int hashCode() {
		return idTour;
	}

	@Override
	public String toString() {
		return this.getClass().getName() + "Id = " + idTour;
	}

	@Override
	public boolean equals(Object tour) {
		if (tour == null || (tour.getClass() != this.getClass())) {
			return false;
		} else {
			return this.idTour == ((Tour) tour).getIdTour();
		}
	}
}