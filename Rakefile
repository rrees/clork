
code_dirs = ["src"]
test_dirs = ["test"]

test_dirs << code_dirs

run_jars = Dir.new('lib').entries.select{|f| f =~ /.*.jar/}.map {|jar| File.join('lib', jar)}

task :default => [:clork]

task :clork do
	classpath_entries = [] << run_jars << code_dirs
	run_clork = "java -cp #{classpath_entries.join(':')} jline.ConsoleRunner clojure.main"
	puts run_clork
	system(run_clork)
end

task :test do
	classpath_entries = [] << test_dirs << run_jars
	run_clork = "java -cp #{classpath_entries.join(':')} jline.ConsoleRunner clojure.main test/clork-test.clj"
	puts run_clork
	system(run_clork)
end
