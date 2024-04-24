# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_jazzy
inherit ros_superflore_generated

DESCRIPTION = "diagnostics"
AUTHOR = "Austin Hendrix <namniart@gmail.com>"
ROS_AUTHOR = "Kevin Watts"
HOMEPAGE = "http://www.ros.org/wiki/diagnostics"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=4633480cdd27d7906aaf3ef4b72014b2"

ROS_CN = "diagnostics"
ROS_BPN = "diagnostics"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    diagnostic-aggregator \
    diagnostic-common-diagnostics \
    diagnostic-updater \
    self-test \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/diagnostics-release/archive/release/jazzy/diagnostics/3.1.2-3.tar.gz
ROS_BRANCH ?= "branch=release/jazzy/diagnostics"
SRC_URI = "git://github.com/ros2-gbp/diagnostics-release;${ROS_BRANCH};protocol=https"
SRCREV = "5b26998e35920e1f180210c14e5867457a8769d0"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
