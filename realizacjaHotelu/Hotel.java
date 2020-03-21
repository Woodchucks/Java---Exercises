import java.util.ArrayList;
import java.util.List;
class Hotel {
    List<NumerPokoju> pokoje = new ArrayList<NumerPokoju>();

    public Hotel(int lpokoi, int lpieter) {
        for(int j=0; j<lpieter; j++){
            for(int i=0; i<lpokoi; i++) {
                pokoje.add(new NumerPokoju(i+1,j));
            }
        }
    }

    public boolean czyWolny() {
        for (NumerPokoju numerPokoju : pokoje) {
            if(numerPokoju.czyWolny()) {
                return true;
            }
        }
        return false;
    }

    public int ileWolnych() {
        int liczbaWolnychPokoi = 0;
        for (NumerPokoju numerPokoju : pokoje) {
            if(numerPokoju.czyWolny()) {
                liczbaWolnychPokoi++;
            }
        }
        return liczbaWolnychPokoi;
    }

    public int wynajmij(Osoba os) {
        for (NumerPokoju numerPokoju : pokoje) {
            if(numerPokoju.czyWolny()) {
                return numerPokoju.wynajmij(os);
            }
        }
        return 0;
    }

    public boolean czyWynajmuje(Osoba os) {
        for (NumerPokoju numerPokoju : pokoje) {
            if(numerPokoju.czyWynajmuje(os)) {
                return true;
            }
        }
        return false;
    }

    public void zwolnijWszystkiePokoje(Osoba os) {
        for (NumerPokoju numerPokoju : pokoje) {
            if(numerPokoju.czyWynajmuje(os)) {
                numerPokoju.zwolnij(os);
            }
        }
    }
}
