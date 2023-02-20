public class Chef {

    Personal pers1;
    Personal pers2;
    //boolean personalNötig = true;


    public Chef(){

        pers1 = null;
        pers2 = null;

    }

    public void neuesPersonal(Personal einP){

        if(pers1 == null){
            this.pers1 = einP;
        }
        this.pers2 = einP;
    }
}
