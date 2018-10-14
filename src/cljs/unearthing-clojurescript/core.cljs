(ns unearthing-clojurescript.core
  (:require [reagent.core :as reagent]
            [devtools.core :as devtools]
            [re-frame.core :as rf]
            [unearthing-clojurescript.state.subs]
            [unearthing-clojurescript.state.events]
            [unearthing-clojurescript.app :as app]))

(devtools/install!)
(enable-console-print!)

(rf/dispatch-sync [:initialise-db])

;; -- VIEW --------------------------------------------------------------------

(defn app-component
  []
  [:div
   [app/component]])

(reagent/render-component [app-component]
                          (. js/document (getElementById "app")))

(defn on-js-reload []
  (reagent/force-update-all))
