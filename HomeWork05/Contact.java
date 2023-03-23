public class Contact {
    public String lastname;
    public String firstname;
    public String middlename;
    public String telnumber;
    public String emailaddr;

    public Contact(String lastname, String firstname, String middlename, String telnumber, String emailaddr) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.telnumber = telnumber;
        this.middlename = middlename;
        this.emailaddr = emailaddr;
    }

    public Contact(String lastname, String firstname, String telnumber) {
        this (lastname,firstname,"",telnumber,"");
    }

    public Contact(String firstname, String telnumber) {
        this ("",firstname,"",telnumber,"");
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getTelnumber() {
        return telnumber;
    }

    public void setTelnumber(String telnumber) {
        this.telnumber = telnumber;
    }

    public String getEmailaddr() {
        return emailaddr;
    }

    public void setEmailaddr(String emailaddr) {
        this.emailaddr = emailaddr;
    }


    @Override
    public String toString() {
        return
                lastname + " " + firstname + " " + middlename + " -- " + telnumber +
                        " --  " + emailaddr;

    }
}