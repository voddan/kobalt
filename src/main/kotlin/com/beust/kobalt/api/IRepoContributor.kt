package com.beust.kobalt.api

import java.net.URI

/**
 * Plugins that add their own repos.
 */
interface IRepoContributor : IContributor {
    fun reposFor(project: Project?) : List<URI>
}

