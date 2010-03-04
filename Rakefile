
code_dirs = ["src"]
test_dirs = ["test"]

test_dirs << code_dirs

task :default => [:hello]

task :hello do
  puts "Hello world"
end

task :clork do
  run_clork = "java -cp #{code_dirs.join(':')}:lib/clojure.jar:lib/jline-0.9.94.jar jline.ConsoleRunner clojure.main"
  puts run_clork
  system(run_clork)
end

task :test do
	  run_clork = "java -cp #{test_dirs.join(':')}:lib/clojure.jar:lib/jline-0.9.94.jar jline.ConsoleRunner clojure.main test/clork-test.clj"
	  puts run_clork
	  system(run_clork)
end
