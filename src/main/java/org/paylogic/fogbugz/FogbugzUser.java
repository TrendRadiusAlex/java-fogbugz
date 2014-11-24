package org.paylogic.fogbugz;

/**
 *
 * @author dirk
 */
public class FogbugzUser {
    public int ix;
    public String name;
    public String email;
    
    public FogbugzUser(int ix, String name, String email){
        this.ix = ix;
        this.name = name;
        this.email = email;
    }
    
    @Override
    public boolean equals(Object other){
        if (other instanceof FogbugzUser){
            FogbugzUser o = (FogbugzUser) other;
            return o.ix == this.ix && o.name.equals(this.name) && o.email.equals(this.email);
        }
        return false;
    }

}
