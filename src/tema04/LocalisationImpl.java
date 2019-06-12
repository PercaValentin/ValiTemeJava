package tema04;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class LocalisationImpl implements Localisation {

	private Language currentLanguage;
	private Map<Language, Properties> messages = new HashMap<>();

	public LocalisationImpl() {
		setLanguage(Language.EN);

	}

	@Override
	public void setLanguage(Language language) {
		currentLanguage = language;
		if (messages.get(currentLanguage) == null) {
			String fileName = "messages_" + language.toString().toLowerCase() + ".txt";
			Properties prop = new Properties();

		}

	}

	@Override
	public void getMessage(String key) {
		// TODO Auto-generated method stub

	}

}
