package spiderbiggen.sbc.core.helper;

import cpw.mods.fml.common.registry.LanguageRegistry;

public class LocalizationHelper {

    public static boolean isFileXML(String fileName){
        return fileName.endsWith(".xml");
    }

    public static String getLocalFromFileName(String fileName){
        return fileName.substring(fileName.lastIndexOf("/") + 1, fileName.lastIndexOf("."));
    }

    public static String getLocalizationString(String key){
        return LanguageRegistry.instance().getStringLocalization(key);
    }
}
