(ns unearthing-clojurescript.state.events
  (:require [re-frame.core :refer [reg-event-db reg-event-fx reg-fx] :as rf]
            [unearthing-clojurescript.state.db :refer [default-db]]))

(reg-event-db
  :initialise-db
  (fn [_ _]
    default-db))

(reg-event-db
  :store-login
  (fn [db [_ token]]
    (assoc db :token token)))

(reg-event-fx
  :login
  (fn [{:keys [db]} [_ credentials]]
    {:request-token credentials}))

(reg-fx
  :request-token
  (fn [{:keys [username password]}]
    (let [token "abc123"]
      (rf/dispatch [:store-login token]))))
