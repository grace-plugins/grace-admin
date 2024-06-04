package org.graceframework.plugins.admin

class PluginController {
    static namespace = 'admin'

    def pluginManager

    def index() {
      [pluginList: pluginManager.allPlugins]
    }

}
