(defproject unearthing-clojurescript "0.0.1"
  :description "A set of demos detailing how to make a basic reagent application"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [efisef/ensorcel "0.2.5-1"]
                 [binaryage/devtools "0.9.4"]
                 [org.clojure/clojurescript "1.10.238" :scope "provided"]
                 [reagent "0.7.0"]]

  :source-paths ["src/cljs" "src/clj" "src/cljc"]
  :main ^:skip-aot example.core

  :jvm-opts ["--add-modules" "java.xml.bind"]

  :plugins [[lein-figwheel "0.5.16"]
            [lein-cljsbuild "1.1.7" :exclusions [[org.clojure/clojure]]]]

  :cljsbuild {:builds
              [{:id "dev"
                :source-paths ["src/cljs" "src/cljc"]
                :figwheel {:on-jsload "unearthing-clojurescript.core/on-js-reload"
                           :open-urls ["http://localhost:3449/index.html"]}

                :compiler {:main unearthing-clojurescript.core
                           :asset-path "js/compiled/out"
                           :output-to "resources/public/js/compiled/unearthing-clojurescript.js"
                           :output-dir "resources/public/js/compiled/out"
                           :source-map-timestamp true}}]}

  :figwheel {:css-dirs ["resources/public/css"]}

  :profiles {:dev {:dependencies [[binaryage/devtools "0.9.9"]
                                  [figwheel-sidecar "0.5.16"]
                                  [cider/piggieback "0.3.1"]]
                   :source-paths ["dev" "src/cljc" "src/clj"]
                   :clean-targets ^{:protect false} ["resources/public/js/compiled"]}})
