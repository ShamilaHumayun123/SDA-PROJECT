
package employeemanagementsystem;


public class Attendance {

    public int id;
    public String Name;
    public String Date;
    public String TimeIn;
    public String TimeOut;
   
    public Attendance()
    {
        
    }
    public Attendance(int id, String Name, String Date, String TimeIn, String TimeOut) {
        this.id = id;
        this.Name = Name;
        this.Date = Date;
        this.TimeIn = TimeIn;
        this.TimeOut = TimeOut;   
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getTimeIn() {
        return TimeIn;
    }

    public void setTimeIn(String TimeIn) {
        this.TimeIn = TimeIn;
    }

    public String getTimeOut() {
        return TimeOut;
    }

    public void setTimeOut(String TimeOut) {
        this.TimeOut = TimeOut;
    }    
    
}
