package spiderbiggen.sbc.core;

import spiderbiggen.sbc.core.helper.LocalizationHelper;
import spiderbiggen.sbc.lib.Localizations;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class LocalizationHandler {

    public static void loadLanguages(){
        for (String localizationFile : Localizations.LocalFiles) {
            LanguageRegistry.instance().loadLocalization(localizationFile, LocalizationHelper.getLocalFromFileName(localizationFile), LocalizationHelper.isFileXML(localizationFile));
        }
    }

}
