package org.jabref.gui.preferences.conference;

import org.jabref.gui.preferences.AbstractPreferenceTabView;
import org.jabref.gui.preferences.PreferencesTab;
import org.jabref.logic.l10n.Localization;

public class ConferenceAbbreviationsTab extends AbstractPreferenceTabView<ConferenceAbbreviationsTabViewModel> implements PreferencesTab {
    @Override
    public void setValues() {
        this.viewModel = new ConferenceAbbreviationsTabViewModel();
        viewModel.setValues();
    }

    @Override
    public String getTabName() {
        return Localization.lang("Conference abbreviations");
    }
}
