(defproject cthulhu "0.1.0-SNAPSHOT"
  :description "My Little Cthulhu"
  :plugins [[lein-cljsbuild "0.2.9"]]
  :cljsbuild {
    :builds [{:source-path "src"
              :compiler {
                :output-to "resources/public/client.js"
                :optimizations :whitespace
                :pretty-print true}}]}
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [com.novemberain/monger "1.0.0-beta8"]
                 [noir "1.3.0-beta10"]
                 [hiccup "1.0.2"]
                 [fetch "0.1.0-alpha2"]
                 [crate "0.2.1"]
                 [fluentsoftware/cljs-binding "1.0.0-SNAPSHOT"]]
  :main ^{:skip-aot true} cthulhu.server)
