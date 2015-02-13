package env

import static cucumber.api.groovy.Hooks.*
import geb.Browser
import geb.binding.BindingUpdater

def bindingUpdater
Before() {
        bindingUpdater = new BindingUpdater(binding, new Browser())
        bindingUpdater.initialize()
}

After() {
    bindingUpdater.remove()
}