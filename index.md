---
layout: home
title: "Forbidden Island Project"
heading: "Forbidden Island Recreation"
subheading: "A Java recreation of the cooperative board game where teamwork saves the day"
---

<div class="space-y-12">
    <!-- Main Featured Demo GIF -->
    <div class="flex justify-center">
        <img class="object-cover object-top w-full max-w-4xl h-auto rounded-lg shadow-lg" 
             src="{{ site.baseurl }}/assets/img/forbidden-island-demo.gif" 
             alt="Forbidden Island Game Demo - Cooperative Adventure">
    </div>

    <div class="space-y-6">
        <div class="space-y-4">
            <h3 class="text-3xl font-bold leading-tight text-gray-900 sm:text-4xl dark:text-white">
                Forbidden Island Recreation
            </h3>

            <p class="text-base font-normal text-gray-500 sm:text-lg dark:text-gray-400">
                This project is a recreation of the board game <em>Forbidden Island</em> in Java. Forbidden Island is a 2-4 player cooperative multiplayer board game in which players must move around the board in attempts to retrieve all four treasures and escape before the island sinks.
            </p>
            <p class="text-base font-normal text-gray-500 sm:text-lg dark:text-gray-400">
                Built with Java Swing and featuring the modern <a href="https://github.com/JFormDesigner/FlatLaf" target="_blank" class="text-primary-600 hover:text-primary-700 dark:text-primary-500">FlatLaf</a> Nord theme, this recreation captures the excitement and strategic depth of the original cooperative board game. As highlighted in the <a href="https://blog.homeforfiction.com/2022/03/21/forbidden-island-javascript-app-creation/">Forbidden Island JavaScript blog post</a>, the game represents "the most genuine form of creation" - built for the pure joy of recreating a beloved game experience.
            </p>
        </div>

        <!-- Technology Tags -->
        <div class="flex items-center gap-2.5 flex-wrap">
            <div class="p-1 rounded-lg hover:bg-gray-50 dark:hover:bg-gray-800">
                <span class="inline-flex items-center px-3 py-1 text-xs font-medium text-gray-800 bg-gray-100 rounded-full dark:bg-gray-700 dark:text-gray-300">
                    Java
                </span>
            </div>
            <div class="p-1 rounded-lg hover:bg-gray-50 dark:hover:bg-gray-800">
                <span class="inline-flex items-center px-3 py-1 text-xs font-medium text-gray-800 bg-gray-100 rounded-full dark:bg-gray-700 dark:text-gray-300">
                    Java Swing
                </span>
            </div>
            <div class="p-1 rounded-lg hover:bg-gray-50 dark:hover:bg-gray-800">
                <span class="inline-flex items-center px-3 py-1 text-xs font-medium text-gray-800 bg-gray-100 rounded-full dark:bg-gray-700 dark:text-gray-300">
                    FlatLaf Nord
                </span>
            </div>
            <div class="p-1 rounded-lg hover:bg-gray-50 dark:hover:bg-gray-800">
                <span class="inline-flex items-center px-3 py-1 text-xs font-medium text-gray-800 bg-gray-100 rounded-full dark:bg-gray-700 dark:text-gray-300">
                    Maven
                </span>
            </div>
            <div class="p-1 rounded-lg hover:bg-gray-50 dark:hover:bg-gray-800">
                <span class="inline-flex items-center px-3 py-1 text-xs font-medium text-gray-800 bg-gray-100 rounded-full dark:bg-gray-700 dark:text-gray-300">
                    Cooperative Game
                </span>
            </div>
            <div class="p-1 rounded-lg hover:bg-gray-50 dark:hover:bg-gray-800">
                <span class="inline-flex items-center px-3 py-1 text-xs font-medium text-gray-800 bg-gray-100 rounded-full dark:bg-gray-700 dark:text-gray-300">
                    Board Game Recreation
                </span>
            </div>
        </div>

        <!-- How to Play Section -->
        <div class="mt-8">
            <h4 class="text-2xl font-bold text-gray-900 dark:text-white mb-6">How to Play</h4>

            <!-- Game Overview -->
            <div class="bg-gray-50 dark:bg-gray-900 rounded-lg p-6 mb-8">
                <h5 class="text-xl font-semibold text-gray-900 dark:text-white mb-4">The Adventure Begins</h5>
                <p class="text-base text-gray-600 dark:text-gray-400 mb-4">
                    Each turn, players can make three actions: <strong>Move</strong>, <strong>Shore up</strong> (repair flooded tiles), <strong>Trade</strong> treasure cards, or <strong>Retrieve Treasure</strong>. Players are given unique roles with special abilities to help the team succeed.
                </p>
                <div class="flex justify-center mb-4">
                    <img class="w-full max-w-2xl h-auto rounded border border-gray-200 dark:border-gray-700"
                         src="{{ site.baseurl }}/assets/img/forbidden-island-demo.gif" alt="Forbidden Island Gameplay Demo">
                </div>
                <p class="text-sm text-gray-600 dark:text-gray-400">
                    Communication and cooperation are essential - players must work together to collect four of each treasure card, visit treasure locations, and escape via helicopter before the island sinks!
                </p>
            </div>

            <!-- Game Mechanics Grid -->
            <div class="grid grid-cols-1 md:grid-cols-2 gap-6">
                <!-- Player Actions -->
                <div class="bg-gray-50 dark:bg-gray-900 rounded-lg p-6">
                    <h5 class="text-lg font-semibold text-gray-900 dark:text-white mb-2">Player Actions</h5>
                    <p class="text-sm text-gray-600 dark:text-gray-400 mb-4">Each player gets three actions per turn:</p>
                    <ul class="text-sm text-gray-600 dark:text-gray-400 space-y-2">
                        <li class="flex items-center"><span class="w-2 h-2 bg-primary-500 rounded-full mr-2"></span>Move to adjacent tiles</li>
                        <li class="flex items-center"><span class="w-2 h-2 bg-primary-500 rounded-full mr-2"></span>Shore up flooded tiles</li>
                        <li class="flex items-center"><span class="w-2 h-2 bg-primary-500 rounded-full mr-2"></span>Trade treasure cards</li>
                        <li class="flex items-center"><span class="w-2 h-2 bg-primary-500 rounded-full mr-2"></span>Retrieve treasure (with 4 matching cards)</li>
                    </ul>
                </div>

                <!-- Special Cards -->
                <div class="bg-gray-50 dark:bg-gray-900 rounded-lg p-6">
                    <h5 class="text-lg font-semibold text-gray-900 dark:text-white mb-2">Special Cards</h5>
                    <p class="text-sm text-gray-600 dark:text-gray-400 mb-4">Cards that can be used anytime:</p>
                    <ul class="text-sm text-gray-600 dark:text-gray-400 space-y-2">
                        <li class="flex items-center"><span class="w-2 h-2 bg-green-500 rounded-full mr-2"></span>Helicopter Lift - Move anywhere or escape</li>
                        <li class="flex items-center"><span class="w-2 h-2 bg-green-500 rounded-full mr-2"></span>Sandbag - Shore up any tile</li>
                    </ul>
                </div>

                <!-- Win Conditions -->
                <div class="bg-gray-50 dark:bg-gray-900 rounded-lg p-6">
                    <h5 class="text-lg font-semibold text-gray-900 dark:text-white mb-2">Victory</h5>
                    <p class="text-sm text-gray-600 dark:text-gray-400 mb-4">To win, players must:</p>
                    <ul class="text-sm text-gray-600 dark:text-gray-400 space-y-2">
                        <li class="flex items-center"><span class="w-2 h-2 bg-green-500 rounded-full mr-2"></span>Collect all four treasures</li>
                        <li class="flex items-center"><span class="w-2 h-2 bg-green-500 rounded-full mr-2"></span>Return to Fools Landing</li>
                        <li class="flex items-center"><span class="w-2 h-2 bg-green-500 rounded-full mr-2"></span>Use Helicopter Lift to escape</li>
                    </ul>
                </div>

                <!-- Defeat Conditions -->
                <div class="bg-gray-50 dark:bg-gray-900 rounded-lg p-6">
                    <h5 class="text-lg font-semibold text-gray-900 dark:text-white mb-2">Defeat</h5>
                    <p class="text-sm text-gray-600 dark:text-gray-400 mb-4">The game ends if:</p>
                    <ul class="text-sm text-gray-600 dark:text-gray-400 space-y-2">
                        <li class="flex items-center"><span class="w-2 h-2 bg-red-500 rounded-full mr-2"></span>A player is stranded on a sinking tile</li>
                        <li class="flex items-center"><span class="w-2 h-2 bg-red-500 rounded-full mr-2"></span>Both treasure tiles sink before claiming</li>
                        <li class="flex items-center"><span class="w-2 h-2 bg-red-500 rounded-full mr-2"></span>Fools Landing sinks</li>
                    </ul>
                </div>
            </div>
        </div>

        <!-- Key Features -->
        <div class="mt-8">
            <h4 class="text-2xl font-bold text-gray-900 dark:text-white mb-6">Key Features</h4>
            <div class="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-6">
                <div class="bg-white dark:bg-gray-900 p-6 rounded-lg border border-gray-200 dark:border-gray-700">
                    <h5 class="font-semibold text-gray-900 dark:text-white mb-2">Cooperative Gameplay</h5>
                    <p class="text-sm text-gray-600 dark:text-gray-400">Work together as a team - victory or defeat is shared by all players.</p>
                </div>
                <div class="bg-white dark:bg-gray-900 p-6 rounded-lg border border-gray-200 dark:border-gray-700">
                    <h5 class="font-semibold text-gray-900 dark:text-white mb-2">Unique Player Roles</h5>
                    <p class="text-sm text-gray-600 dark:text-gray-400">Each player has special abilities like the Diver's swimming or the Pilot's flying.</p>
                </div>
                <div class="bg-white dark:bg-gray-900 p-6 rounded-lg border border-gray-200 dark:border-gray-700">
                    <h5 class="font-semibold text-gray-900 dark:text-white mb-2">Dynamic Board State</h5>
                    <p class="text-sm text-gray-600 dark:text-gray-400">The island constantly floods and changes, creating new challenges each game.</p>
                </div>
                <div class="bg-white dark:bg-gray-900 p-6 rounded-lg border border-gray-200 dark:border-gray-700">
                    <h5 class="font-semibold text-gray-900 dark:text-white mb-2">Modern UI Design</h5>
                    <p class="text-sm text-gray-600 dark:text-gray-400">Clean, intuitive interface with FlatLaf Nord theme for enhanced gameplay.</p>
                </div>
                <div class="bg-white dark:bg-gray-900 p-6 rounded-lg border border-gray-200 dark:border-gray-700">
                    <h5 class="font-semibold text-gray-900 dark:text-white mb-2">Strategic Depth</h5>
                    <p class="text-sm text-gray-600 dark:text-gray-400">Balance risk and reward while managing resources and planning moves together.</p>
                </div>
                <div class="bg-white dark:bg-gray-900 p-6 rounded-lg border border-gray-200 dark:border-gray-700">
                    <h5 class="font-semibold text-gray-900 dark:text-white mb-2">Faithful Recreation</h5>
                    <p class="text-sm text-gray-600 dark:text-gray-400">True to the original board game mechanics and spirit of cooperation.</p>
                </div>
            </div>
        </div>

        <!-- Game Architecture -->
        <div class="mt-8">
            <h4 class="text-2xl font-bold text-gray-900 dark:text-white mb-6">Technical Implementation</h4>
            <div class="bg-gray-50 dark:bg-gray-900 rounded-lg p-6">
                <div class="grid grid-cols-1 md:grid-cols-2 gap-6">
                    <div>
                        <h5 class="font-semibold text-gray-900 dark:text-white mb-3">Architecture</h5>
                        <ul class="text-sm text-gray-600 dark:text-gray-400 space-y-2">
                            <li>• <strong>Model-View separation:</strong> Game logic separate from UI</li>
                            <li>• <strong>Panel-based UI:</strong> Menu, Game, Help, Victory/Defeat screens</li>
                            <li>• <strong>Component design:</strong> Players, Cards, Board, Game State</li>
                        </ul>
                    </div>
                    <div>
                        <h5 class="font-semibold text-gray-900 dark:text-white mb-3">Technologies</h5>
                        <ul class="text-sm text-gray-600 dark:text-gray-400 space-y-2">
                            <li>• <strong>Java 16:</strong> Modern language features</li>
                            <li>• <strong>Swing:</strong> Cross-platform GUI framework</li>
                            <li>• <strong>Maven:</strong> Dependency and build management</li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>

        <!-- Installation Instructions -->
        <div class="mt-8">
            <h4 class="text-2xl font-bold text-gray-900 dark:text-white mb-6">Getting Started</h4>
            <div class="bg-gray-50 dark:bg-gray-900 rounded-lg p-6">
                <ol class="list-decimal list-inside space-y-3 text-gray-600 dark:text-gray-400">
                    <li><a href="https://www.oracle.com/java/technologies/downloads/" target="_blank" class="text-primary-600 hover:text-primary-700 dark:text-primary-500">Download</a> the latest JRE to run the .jar file</li>
                    <li><a href="https://github.com/nitheesh-cpu/Forbidden-Island/releases/download/Download/ForbiddenIslandFX.jar" target="_blank" class="text-primary-600 hover:text-primary-700 dark:text-primary-500">Download</a> the project .jar file from GitHub</li>
                    <li>Double-click the file to launch the adventure</li>
                </ol>
            </div>
        </div>

        <!-- GitHub and Download Buttons -->
        <div class="mt-8 flex flex-col sm:flex-row gap-4">
            <a href="https://github.com/nitheesh-cpu/Forbidden-Island" target="_blank" title="View Source Code"
                class="text-white inline-flex items-center justify-center bg-primary-700 hover:bg-primary-800 focus:ring-4 focus:outline-none focus:ring-primary-300 font-medium rounded-lg text-sm px-5 py-2.5 dark:bg-primary-600 dark:hover:bg-primary-700 dark:focus:ring-primary-800"
                role="button">
                <svg aria-hidden="true" class="w-5 h-5 mr-2" fill="currentColor" viewBox="0 0 24 24">
                    <path fill-rule="evenodd" d="M12 2C6.477 2 2 6.484 2 12.017c0 4.425 2.865 8.18 6.839 9.504.5.092.682-.217.682-.483 0-.237-.008-.868-.013-1.703-2.782.605-3.369-1.343-3.369-1.343-.454-1.158-1.11-1.466-1.11-1.466-.908-.62.069-.608.069-.608 1.003.07 1.531 1.032 1.531 1.032.892 1.53 2.341 1.088 2.91.832.092-.647.35-1.088.636-1.338-2.22-.253-4.555-1.113-4.555-4.951 0-1.093.39-1.988 1.029-2.688-.103-.253-.446-1.272.098-2.65 0 0 .84-.27 2.75 1.026A9.564 9.564 0 0112 6.844c.85.004 1.705.115 2.504.337 1.909-1.296 2.747-1.027 2.747-1.027.546 1.379.202 2.398.1 2.651.64.7 1.028 1.595 1.028 2.688 0 3.848-2.339 4.695-4.566 4.943.359.309.678.92.678 1.855 0 1.338-.012 2.419-.012 2.747 0 .268.18.58.688.482A10.019 10.019 0 0022 12.017C22 6.484 17.522 2 12 2z" clip-rule="evenodd"></path>
                </svg>
                View Source Code
            </a>
            <a href="https://github.com/nitheesh-cpu/Forbidden-Island/releases/download/Download/ForbiddenIslandFX.jar" target="_blank" title="Download Game"
                class="text-gray-900 bg-white border border-gray-300 focus:outline-none hover:bg-gray-100 focus:ring-4 focus:ring-gray-200 font-medium rounded-lg text-sm px-5 py-2.5 dark:bg-gray-800 dark:text-white dark:border-gray-600 dark:hover:bg-gray-700 dark:hover:border-gray-600 dark:focus:ring-gray-700 inline-flex items-center justify-center"
                role="button">
                <svg aria-hidden="true" class="w-5 h-5 mr-2" fill="none" stroke="currentColor" viewBox="0 0 24 24">
                    <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M12 10v6m0 0l-3-3m3 3l3-3m2 8H7a2 2 0 01-2-2V5a2 2 0 012-2h5.586a1 1 0 01.707.293l5.414 5.414a1 1 0 01.293.707V19a2 2 0 01-2 2z"></path>
                </svg>
                Download Game
            </a>
        </div>
    </div>

</div>
