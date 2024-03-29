package src.models;

import org.json.simple.JSONObject;
import src.helper.Constants;

import java.util.ArrayList;

/**
 * La classe "ListContact" va lister les attributs utilisé
 * dans l'affichage de la list des contactes.
 */

public class ListContact {
    private ArrayList<Contact> contactArr;
    private MyJsonManager jsonMan;


    /**
     * Le constructeur "ListContact" va permettre de générer
     * cette liste de contact.
     */

    public ListContact() {
        contactArr = new ArrayList<>();
        jsonMan = new MyJsonManager(Constants.CONTACT_JSON_FILE);
        init();
    }


    /**
     * La méthode "init" va collecter les différentes information
     * par le biais d'un reader Json.
     */

    public void init() {
        jsonMan.getReadedJson().forEach(ctct -> {
            JSONObject ctc_tmp = (JSONObject) ctct;
            contactArr.add(new Contact((String) ctc_tmp.get("firstName"),
                    (String) ctc_tmp.get("lastName"),
                    (String) ctc_tmp.get("companyName"),
                    (String) ctc_tmp.get("phoneNumber"),
                    (String) ctc_tmp.get("address"),
                    (String) ctc_tmp.get("city"),
                    //(String) ctc_tmp.get("zipcode"),
                    (String) ctc_tmp.get("dateOfBirth"),
                    (String) ctc_tmp.get("emailAddress"),
                    ctc_tmp, jsonMan));
        });
    }
    public ArrayList<Contact> getArrayList() {
        return contactArr;
    }
    public void removeContact(Contact ctc) {
        jsonMan.removeObject(ctc.getJsonObject());
        contactArr.remove(ctc);
    }
}
